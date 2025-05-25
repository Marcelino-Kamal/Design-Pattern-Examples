package BuilderPattern;

public class Client {
    
    public static void main(String[] args) {

        PizzaBuilder pb =  new MeatPizzaBuilder();
        PizzaDirector pd = new PizzaDirector(pb);

        pd.buildpizza();
        Pizza pizza = pd.getPizza();
        pizza.showPizza();

        PizzaBuilder pbV = new VeggiePizzaBuilder();
        PizzaDirector pdv = new PizzaDirector(pbV);

        pdv.buildpizza();
        Pizza Mpizza = pdv.getPizza();
        Mpizza.showPizza();

    }
}
