package DecratorPattern;

public class SprinkleCooke extends CookieDecorator {


    public SprinkleCooke(Cookie cookie) {
        super(cookie);

    }

    @Override
    public double getCost() {

        return super.getCost() + 8.50;
    }

    @Override
    public String getDesc() {

        return super.getDesc() + " with Sprinkles Chips";
    }

}
