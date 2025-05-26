package StrategyPattern;

public class SonMain {

    public static void main(String[] args) {
        MamaStrategyPicker Ms = new MamaStrategyPicker(new OnFeetStrategy());

        Ms.executeStrategy("You will be");

        Ms.StrategyPick(new CarStrategy());
        Ms.executeStrategy("You will be");

        Ms.StrategyPick(new TrainStrategy());
        Ms.executeStrategy("You will go");
    }

}
