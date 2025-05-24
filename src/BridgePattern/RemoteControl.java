package BridgePattern;

public  class RemoteControl {
    protected Device d;
    public RemoteControl(Device d) {
        this.d=d;
    }

    public void toggle(){
        if(d.inEnabled()){
            d.turnOff();
        }else{
            d.turnOn();
        }
    }

}
