import java.util.ArrayList;
public class ConcreteSubject implements Subject{
    
    private String state;
    private ArrayList<Observer> observers = new ArrayList<>();

    public ConcreteSubject(String state){
        this.state = state;
    }
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(state);
        }
    }

    public void setState(String state){
        this.state = state;
        notifyObserver();
    }
}
