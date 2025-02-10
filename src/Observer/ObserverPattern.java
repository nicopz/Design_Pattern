package Observer;

//Nutzung
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Beobachter 1");
        Observer observer2 = new ConcreteObserver("Beobachter 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("Neuer Zustand 1");
        subject.setState("Neuer Zustand 2");
    }
}