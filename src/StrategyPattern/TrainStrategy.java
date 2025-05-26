package StrategyPattern;

public class TrainStrategy implements TransportStrategy{

    @Override
    public String TransportType(String MamaSays) {
        return MamaSays + " On Train";    
    }

}
