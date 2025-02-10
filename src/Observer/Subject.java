package Observer;

import java.util.ArrayList;
import java.util.List;

//Zu beobachtendes Objekt
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String state;

    public void  addObserver(Observer observer){observers.add(observer);}
    public void removeObserver(Observer observer){observers.remove(observer);}

    public void setState(String state){
        this.state = state;
        notifyObservers();
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(state);
        }
    }
}
