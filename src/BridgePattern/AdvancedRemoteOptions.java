package BridgePattern;

public class AdvancedRemoteOptions extends RemoteControl {

    public AdvancedRemoteOptions(Device d) {
        super(d);
        
    }
    public void mute(){
        System.out.println("Device is muted");
    }

}
