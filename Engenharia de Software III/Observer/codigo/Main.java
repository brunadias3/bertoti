package codigo;

public class Main {
  public static void main(String[] args) {
    NewsLetter observable = new NewsLetter();
    Phone observer = new Phone();
    Computer ob2 = new Computer();

    // adicionando observadores
    observable.addObserver(observer);
    observable.addObserver(ob2);

    // notificando celular e computador
    observable.notifyObservers("Boletim Diário: xxx....");
    System.out.println("");

    // removendo computador
    observable.removeObserver(ob2);

    // notificando somente o celular
    observable.notifyObservers("Resumo de Segunda-Feira:..");

    observable.removeObserver(observer);
  }
}
