package StrategyPattern;

public class MamaStrategyPicker {
    private TransportStrategy Ts;

    public MamaStrategyPicker(TransportStrategy ts) {
        Ts = ts;
    }

    public void StrategyPick(TransportStrategy ts){
        Ts=ts;
    }
    public void executeStrategy(String MamaSays){
        System.out.println(Ts.TransportType(MamaSays)+" ");
    }
    
}
