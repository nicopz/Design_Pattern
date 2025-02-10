package Observer;

//Konkreter Observer
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {this.name = name;}
    public void update(String state) {
        System.out.println(name + " erhielt Update: " + state);
    }
}
