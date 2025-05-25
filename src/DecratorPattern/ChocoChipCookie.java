package DecratorPattern;

public class ChocoChipCookie extends CookieDecorator {

    public ChocoChipCookie(Cookie cookie) {
        super(cookie);
       
    }

    @Override
    public double getCost() {
        
        return super.getCost()+50;
    }

    @Override
    public String getDesc() {
    
        return super.getDesc()+" with Choco Chips";
    }
    

}
