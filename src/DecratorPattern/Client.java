package DecratorPattern;

public class Client {

    public static void main(String[] args) {
        Cookie c = new BasicCookie();

        c = new ChocoChipCookie(c);
        c= new SprinkleCooke(c);

        System.out.println("Cookies " + c.getDesc());
        System.out.println("Cost: "+c.getCost()+"$");

    
    }
}
