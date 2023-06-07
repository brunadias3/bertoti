import java.util.ArrayList;
import java.util.List;

public class TaskList implements TaskObserver {
    private String name;
    private List<TaskObserver> observers;
    private List<Task> tasks;

    public TaskList(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTask(Task task) {
        tasks.add(task);
        task.attachObserver(this);
        notifyObservers();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        task.detachObserver(this);
        notifyObservers();
    }

    public void clearTasks() {
        for (Task task : tasks) {
            task.detachObserver(this);
        }
        tasks.clear();
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
            observer.update(null);
        }
    }

    @Override
    public void update(Task task) {
        notifyObservers();
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }
}
