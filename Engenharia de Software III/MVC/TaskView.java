import java.util.List;

public class TaskView implements TaskViewInterface {
    public void displayTasks(List<Task> tasks) {
        System.out.println("\nLista de Tarefas:\n");

        for (Task task : tasks) {
            String status = task.isCompleted() ? "[X]" : "[ ]";
            System.out.println(status + " " + task.getDescription() + '\n');
        }
    }

    public void displayMessage(String message) {
        System.out.println(message+'\n');
    }
}
