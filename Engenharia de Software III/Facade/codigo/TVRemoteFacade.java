public class TVRemoteFacade {
    private TV tv;
    
    public TVRemoteFacade(TV tv) {
        this.tv = tv;
    }
    
    public void turnOn() {
        tv.on();
    }
    
    public void turnOff() {
        tv.off();
    }
    
    public void changeChannel(int channel) {
        tv.setChannel(channel);
    }
    
    public void adjustVolume(int volume) {
        tv.setVolume(volume);
    }
}
