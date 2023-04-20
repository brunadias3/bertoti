public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        TVRemoteFacade remote = new TVRemoteFacade(tv);

        // Usando o "facade" para ligar a TV, mudar de canal e ajustar o volume
        remote.turnOn();
        remote.changeChannel(5);
        remote.adjustVolume(20);

        // Usando o "facade" para desligar a TV
        remote.turnOff();
    }
}