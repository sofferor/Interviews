package questions.diesginPatterns.observer;

public class ObserverExample implements Observer {
    @Override
    public void update() {
        System.out.println("Updated");
    }
}
