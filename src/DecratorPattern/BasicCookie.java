package DecratorPattern;

public class BasicCookie implements Cookie {

    @Override
    public String getDesc() {
            return "Just a Basic cookie";
    }

    @Override
    public double getCost() {
       return 15;
    }

}
