package StrategyPattern;

public class OnFeetStrategy implements TransportStrategy {

    @Override
    public String TransportType(String MamaSays) {
        return MamaSays + " On Foot";
    }

}
