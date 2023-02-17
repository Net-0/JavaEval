package javah.domain.eval.clazz.impl;

import javah.Utils;
import javah.domain.compiler.JavaC;
import javah.domain.compiler.JavaFileCode;
import javah.domain.eval.clazz.ClassEval;
import javah.domain.eval.clazz.ClassEvalException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;

public class StatelessClassEval implements ClassEval {

    ClassLoader classLoader(Path origin) throws MalformedURLException {
        return new URLClassLoader(new URL[]{ origin.toUri().toURL() });
    };

    JavaC javaC(Path origin) throws IOException {
        return new JavaC(origin, Utils.getClassesPaths());
    };

    JavaFileCode fileCode(String code, Path origin) throws IOException {
        return new JavaFileCode(code, origin, javaC(origin));
    }

    public StatelessClassEval() {}

    public <T> Class<? extends T> classFrom(String code) {
        try {
            var tempDir = Utils.randomDir();
            var codeResolver = fileCode(code, tempDir);
            var javaFile = codeResolver.file;

            javaC(tempDir).compile( javaFile );
            var clazz = (Class<? extends T>) classLoader(tempDir).loadClass(codeResolver.mainClassName);

            Utils.deleteDir(tempDir);

            return clazz;
        } catch (Exception ex) {
            throw new ClassEvalException(ex);
        }
    }

}
