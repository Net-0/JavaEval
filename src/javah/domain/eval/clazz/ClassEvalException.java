package javah.domain.eval.clazz;

import javah.domain.compiler.CompilationException;

import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassEvalException extends RuntimeException {

    public ClassEvalException(String message) {
        super(message);
    }

    public ClassEvalException(Exception ex) {
        super(ex);
    }

    public static CompilationException from(StringWriter exceptWritten) {
        String msg = exceptWritten.toString();

        Pattern errorDirRE = Pattern.compile("([^\\/]+\\.java):(\\d+): error: ");
        Matcher match = errorDirRE.matcher(msg);
        if (!match.find()) return new CompilationException(msg);

        msg = msg.substring(match.end());
        String line = match.group(2);
        msg = "Error at line " + line + ": " + msg;

        return new CompilationException(msg);
    }

}
