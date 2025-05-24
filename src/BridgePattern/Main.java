package BridgePattern;

public class Main {

    public static void main(String[] args) {
        Device tDevice =  new TV();
        RemoteControl r = new RemoteControl(tDevice);

        r.toggle();
        r.toggle();

        Device rDevice = new Radio();
        AdvancedRemoteOptions Ro = new AdvancedRemoteOptions(rDevice);
        Ro.toggle();
        Ro.mute();

    }
}
