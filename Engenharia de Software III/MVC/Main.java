import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskController taskController = TaskController.getInstance();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Completar Tarefa");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Exibir Tarefas");
            System.out.println("0. Sair\n");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    scanner.nextLine(); // Limpar o buffer
                    String description = scanner.nextLine();
                    taskController.addTask(description);
                    break;
                case 2:
                    System.out.print("Índice da tarefa a ser concluída: ");
                    int completeIndex = scanner.nextInt();
                    taskController.completeTask(completeIndex);
                    break;
                case 3:
                    System.out.print("Índice da tarefa a ser removida: ");
                    int removeIndex = scanner.nextInt();
                    taskController.removeTask(removeIndex);
                    break;
                case 4:
                    taskController.showTasks();
                    break;
                case 0:
                    System.out.println("\nSaindo...\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }
        } while (choice != 0);

        scanner.close();
    }
}

