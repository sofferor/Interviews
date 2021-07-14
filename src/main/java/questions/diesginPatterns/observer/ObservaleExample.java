package questions.diesginPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservaleExample implements Observable {
    List<Observer> observers;

    public ObservaleExample() {
        observers = new ArrayList<>();
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
