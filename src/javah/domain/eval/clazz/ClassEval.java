package javah.domain.eval.clazz;

import javah.domain.eval.clazz.impl.StateClassEval;
import javah.domain.eval.clazz.impl.StatelessClassEval;

import java.nio.file.Path;

public interface ClassEval {

    /**
     * This method converts the String code at a java runtime class an return it
     * @param code String code to be compiled at a class
     * @return the compiled class
     * @throws ClassEvalException throws when occurs an error while compiling
     */
    <T> Class<? extends T> classFrom(String code) throws ClassEvalException;

    static ClassEval stateless() { return new StatelessClassEval(); }

    static ClassEval stated(Path output) throws Exception { return new StateClassEval(output); }

}
