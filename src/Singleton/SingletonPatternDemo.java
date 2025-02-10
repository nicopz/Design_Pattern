package Singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.showMessage();
        s2.showMessage();
    }
}
