package Padrao;
//variavel estatica
//construtor privado
//metodo de captura+
public class Singleton {

    private Singleton() {

    }
    private static Singleton instancia = null;

    public static Singleton getSingleton() {
        if (instancia == null) {
            System.out.println("instancia criada");
            instancia = new Singleton();
        }
        return instancia;
    }
}
