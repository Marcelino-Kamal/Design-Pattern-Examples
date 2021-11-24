package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Waiter w= new Waiter();
        w.makePizza(new ChickenRanchPizzaBuilder());
        w.makePizza(new SeaFoodPizzaBuilder());

    }
}
