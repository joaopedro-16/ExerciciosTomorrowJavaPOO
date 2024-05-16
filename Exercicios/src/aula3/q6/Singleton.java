package aula3.q6;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void fazAlgumaCoisa() {
        System.out.println("Faz alguma coisa...");
    }
}