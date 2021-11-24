package DecratorPattern;

public class Client {
    public static void main(String[] args) {
        Pizza p=new PlainPizza();
        Chicken chicken=new Chicken(p);
        Cheese cheese=new Cheese(p);
        SeaFood seaFood=new SeaFood(p);
    }
}
