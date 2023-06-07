import java.util.List;

public class TaskController implements TaskObserver {
    private static TaskController instance;
    private TaskList taskList;
    private TaskView taskView;

    private TaskController() {
        this.taskList = new TaskList("Lista de Tarefas");
        this.taskView = new TaskView();
        taskList.attachObserver(this);
    }

    public static TaskController getInstance() {
        if (instance == null) {
            synchronized (TaskController.class) {
                if (instance == null) {
                    instance = new TaskController();
                }
            }
        }
        return instance;
    }

    public void addTask(String description) {
        Task task = new Task(description);
        taskList.addTask(task);
        taskView.displayMessage("\nTarefa adicionada com sucesso!");
    }

    public void completeTask(int index) {
        List<Task> tasks = taskList.getTasks();
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(true);
            taskView.displayMessage("\nTarefa concluída com sucesso!");
        } else {
            taskView.displayMessage("\nÍndice inválido!");
        }
    }

    public void showTasks() {
        List<Task> tasks = taskList.getTasks();
        taskView.displayTasks(tasks);
    }

    @Override
    public void update(Task task) {
        List<Task> tasks = taskList.getTasks();
        taskView.displayTasks(tasks);
    }

    public void removeTask(int index) {
        List<Task> tasks = taskList.getTasks();
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            taskList.removeTask(task);
            taskView.displayMessage("\nTarefa removida com sucesso!");
        } else {
            taskView.displayMessage("\nÍndice inválido!");
        }
    }
    
}
