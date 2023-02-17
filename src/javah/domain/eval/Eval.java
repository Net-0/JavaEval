package javah.domain.eval;

import javah.domain.eval.clazz.ClassEval;

import java.nio.file.Path;

public class Eval {

    private final ClassEval $class;

    public Eval(ClassEval classEval) {
        $class = classEval;
    }

    public <T> Class<? extends T> classFrom(String code) {
        return $class.classFrom(code);
    }

    public static Eval stated(Path evalOutput) throws Exception {
        return new Eval(ClassEval.stated(evalOutput));
    }

    public static Eval stateless() {
        return new Eval(ClassEval.stateless());
    }

}
