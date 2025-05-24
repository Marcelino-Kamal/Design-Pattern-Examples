package BridgePattern;

public class TV implements Device {

    private boolean on = false;

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
       System.out.println("Tv is On");
       on =true;
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is Off");
        on= false;
    }

    @Override
    public boolean inEnabled() {
       return on;
    }

}
