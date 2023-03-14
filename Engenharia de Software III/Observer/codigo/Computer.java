package codigo;
// Classe que implementa um observador específico
class Computer implements Observer {
  @Override
  public void notify(String message) {
    System.out.println("Email: " + message);
  }
}