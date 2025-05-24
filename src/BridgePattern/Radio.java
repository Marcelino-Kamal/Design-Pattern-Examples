package BridgePattern;

public class Radio implements Device {

    private boolean on = false;
    @Override
    public void turnOn() {
        on= true;
        System.out.println("Radio is ON");
        
    }

    @Override
    public void turnOff() {
        on= false;
        System.out.println("Radio is Off");
        
    }

    @Override
    public boolean inEnabled() {
       return on;
    }

}
