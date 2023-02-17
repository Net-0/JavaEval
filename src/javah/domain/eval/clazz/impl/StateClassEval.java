package javah.domain.eval.clazz.impl;

import javah.domain.eval.clazz.ClassEval;
import javah.domain.compiler.JavaC;
import javah.domain.compiler.JavaFileCode;
import javah.Utils;
import javah.domain.eval.clazz.ClassEvalException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;

public class StateClassEval implements ClassEval {

    private final ClassLoader classLoader;
    final JavaC javaC;
    final Path tmpJavaOrigin = Utils.systemTemp;

    public StateClassEval(Path compileOutput) throws Exception {
        classLoader = new URLClassLoader(new URL[]{ compileOutput.toUri().toURL() });
        javaC = new JavaC(compileOutput, Utils.getClassesPaths());
    }

    public <T> Class<? extends T> classFrom(String code) {
        try {
            var codeResolver = new JavaFileCode(code, tmpJavaOrigin, javaC);
            var javaFile = codeResolver.file;

            javaC.compile( javaFile );
            javaFile.delete();

            return (Class<? extends T>) classLoader.loadClass(codeResolver.mainClassName);
        } catch (Exception e) {
            throw new ClassEvalException(e);
        }
    }

}
