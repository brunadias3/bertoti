package codigo;
import java.util.ArrayList;
import java.util.List;
// Classe que representa o objeto observável
class NewsLetter {
  private List<Observer> observers = new ArrayList<Observer>();
  
  // Método para adicionar um novo observador
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  // Método para remover um observador existente
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  // Método para notificar todos os observadores de uma mudança
  public void notifyObservers(String message) {
    for (Observer observer : observers) {
      observer.notify(message);
    }
  }
}