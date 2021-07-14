package questions.diesginPatterns.observer;

public class Demo {
    public static void main(String[] args) {
        ObservaleExample observaleExample = new ObservaleExample();
        ObserverExample observerExample = new ObserverExample();
        observaleExample.addObserver(observerExample);
        observaleExample.notifyAllObserver();
    }
}
