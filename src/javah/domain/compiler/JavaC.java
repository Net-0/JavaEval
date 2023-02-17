package javah.domain.compiler;

import com.sun.source.util.JavacTask;
import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a wrapper class to sugar use of Java Compiler of JDK
 */
public class JavaC {

    private final JavaCompiler realCompiler = ToolProvider.getSystemJavaCompiler();
    final StandardJavaFileManager fileManager = realCompiler.getStandardFileManager(null, null, null);

    private JavaC() {};

    public JavaC(Path compileOut, List<Path> classPaths) throws IOException {
        fileManager.setLocation(StandardLocation.CLASS_OUTPUT, List.of( compileOut.toFile() ));
        fileManager.setLocation(
                StandardLocation.CLASS_PATH,
                classPaths.stream().map(Path::toFile).toList()
        );
    }

    /**
     * This sugar method will return a JavacTask with specified writer and fileObjects
     * @param writer Output Writer to task
     * @param fileObjects List of file to JavacTask process
     * @return a JavacTask with writer and fileObjects arguments
     */
    public JavacTask task(Writer writer, JavaFileObject ...fileObjects) {
        return (JavacTask) this.realCompiler.getTask(writer, fileManager, null, List.of("-Xmaxerrs", "500"), null, List.of(fileObjects));
    }

    public JavacTask task(JavaFileObject ...fileObjects) {
        return this.task(null, fileObjects);
    }

    public JavacTask task(Writer writer, File ...files) {
        return this.task(writer, javaFileObjects(files));
    }

    public JavacTask task(File ...files) {
        return this.task(null, javaFileObjects(files));
    }

    public List<JavaFileObject> javaFileObjects(List<File> files) {
        var javaFiles = new ArrayList<JavaFileObject>();
        fileManager.getJavaFileObjects( files.toArray(File[]::new) ).forEach(javaFiles::add);
        return javaFiles;
    }

    public JavaFileObject[] javaFileObjects(File ...files) {
        var javaFiles = new ArrayList<JavaFileObject>();
        fileManager.getJavaFileObjects( files ).forEach(javaFiles::add);
        return javaFiles.toArray(JavaFileObject[]::new);
    }

    public void compile(File...files) {
        this.compile( javaFileObjects(files) );
    }

    public void compile(JavaFileObject ...fileObjects) {
        StringWriter sr = new StringWriter();
        boolean success = task(sr, fileObjects ).call();
        if (!success) throw CompilationException.from(sr);
    }

}
