package test;

import javah.domain.eval.Eval;

public class Test {

    public static void main(String[] args) throws Exception {
        var eval = Eval.stateless();
        var start = System.currentTimeMillis();

        var clazz = eval.<TestanizandoInterface>classFrom("""
                    
                    package maria.jose.cleber.jorival.noval.neto;
                
                    import test.TestanizandoInterface;
                
                    public class Implementation implements TestanizandoInterface {
                    
                        public void tes() {
                            System.out.println("Demoonstração para o Menino Grijó");
                        }
                    
                    }
                
                """);

        var obj = clazz.newInstance();
        obj.tes();
        System.out.println("Nome da classe: " + clazz.getName());
        System.out.println(System.currentTimeMillis() - start);
    }

}