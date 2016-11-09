package Padrao;

public class Testador {

    public static void main(String[] args) {
        Singleton singleton = null;//nao deixa instanciar

        for (int i = 0; i < 1000; i++) { //mesmo com for sempre
            singleton = Singleton.getSingleton();
        }
    }
}
