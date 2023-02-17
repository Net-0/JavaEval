package javah.domain.compiler;

import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import javah.Utils;
import javah.domain.compiler.visitor.FunctionalVisitor;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class JavaFileCode {

    public final File file;
    public final String fileName;
    public final String mainClassName;
    public final String[] classesNames;

    public final JavaC javaC;

    static class CodeSourceHandler {
        protected String packageName = "";
        protected List<ClassTree> classes = new ArrayList<>();

        public CodeSourceHandler(String code, JavaC javaC) throws IOException {
            var visitor = new FunctionalVisitor<CompilationUnitTree>();

            visitor.onClass((node, unit) -> {
                classes.add(node);
                packageName = unit.getPackageName() == null ? null : unit.getPackageName().toString();
                node.getMembers().forEach( m -> m.accept(visitor, unit) );
            });

            var filePath = Utils.randomFilePath(".java");
            Files.writeString(filePath, code);
            var task = javaC.task(filePath.toFile());

            task.parse().forEach( unit -> unit.getTypeDecls().forEach(type -> type.accept(visitor, unit)) );

            Files.delete(filePath);
        }

        public String getClassName(ClassTree ct) {
            var packagePrefix = packageName == null ? "" : packageName + ".";
            return packagePrefix + ct.getSimpleName();
        }

    }

    public JavaFileCode(String code, Path origin, JavaC javaC) throws IOException {
        var handler = new CodeSourceHandler(code, javaC);

        this.javaC = javaC;
        fileName = getFileName(handler);
        file = getFile(origin, code, handler);
        mainClassName = getMainClassName(handler);
        classesNames = getClassesNames(handler).toArray(String[]::new);
    }

    private static File getFile(Path origin, String code, CodeSourceHandler handler) throws IOException {
        Path codeFilePath = Path.of(origin.toString(), getFileName(handler) + ".java");
        Files.writeString(codeFilePath, code);
        return codeFilePath.toFile();
    }

    private static String getFileName(CodeSourceHandler handler) throws IllegalStateException {
        var firstClass = handler.classes.stream().findFirst();
        Optional<ClassTree> publicClassOpt = handler.classes.stream()
                                                    .filter(JavaFileCode::isPublicClass)
                                                    .findFirst();

        return publicClassOpt.isPresent()
                ? publicClassOpt.get().getSimpleName().toString()
                : firstClass.isPresent()
                    ? firstClass.get().getSimpleName().toString()
                    : UUID.randomUUID().toString();
    }

    private static String getMainClassName(CodeSourceHandler handler) throws IOException {
        var mainClasses = handler.classes.stream()
                                .filter(JavaFileCode::isPublicClass)
                                .toList();

        if (mainClasses.size() == 0) {
            return handler.classes.stream()
                    .map(handler::getClassName)
                    .findFirst()
                    .orElseThrow(() -> new IOException("JavaEval Error -> JavaStringCodeResolver can't find any class at the code"));
        } else if (mainClasses.size() > 1) {
            throw new IOException("JavaEval Error -> your source code can't have more than one public class");
        }

        return mainClasses.stream()
                .map(handler::getClassName)
                .findFirst()
                .orElseThrow(() -> new IOException("JavaEval Error -> JavaStringCodeResolver can't find main class at the code"));
    }

    private static List<String> getClassesNames(CodeSourceHandler handler) throws IllegalStateException {
        return handler.classes.stream()
                .map(handler::getClassName)
                .toList();
    }

    protected static boolean isPublicClass(ClassTree classTree) {
        return classTree.getModifiers().getFlags().contains(Modifier.PUBLIC);
    }

}
