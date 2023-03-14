package codigo;
// Classe que implementa um observador específico
class Phone implements Observer {
  @Override
  public void notify(String message) {
    System.out.println("Notificação: " + message);
  }
}