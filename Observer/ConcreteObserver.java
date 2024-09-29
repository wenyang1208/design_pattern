import java.util.ArrayList;

public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    public void update(String state){
        System.out.println(name + " received message: " + state);
    }
}
