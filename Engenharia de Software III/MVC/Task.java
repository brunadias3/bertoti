import java.util.ArrayList;
import java.util.List;

public class Task {
    private String description;
    private boolean completed;
    private List<TaskObserver> observers;

    public Task(String description) {
        this.description = description;
        this.completed = false;
        this.observers = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
        notifyObservers();
    }

    public void attachObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void detachObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(this);
        }
    }
}
