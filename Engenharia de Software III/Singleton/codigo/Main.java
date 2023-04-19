// Utilização da classe Singleton
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
  
        // Verifica se as duas variáveis referem-se à mesma instância
        System.out.println(singleton1 == singleton2); // Output: true
  
        // Exibe a mensagem "Hello World!" utilizando o objeto singleton1
        singleton1.showMessage();
    }
  }
  