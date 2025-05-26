package StrategyPattern;

public class CarStrategy implements TransportStrategy {

    @Override
    public String TransportType(String MamaSays) {
        return MamaSays + " By Car";
    }

}
