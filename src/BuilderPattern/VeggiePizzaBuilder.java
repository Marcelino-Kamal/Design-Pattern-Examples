package BuilderPattern;

public class VeggiePizzaBuilder implements PizzaBuilder
 {
    private Pizza pizza =  new Pizza();

    @Override
    public void buildDough() {
        
       pizza.setDough("This Crust");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Tomato Sauce");
      
    }

    @Override
    public void buildTopping() {
       pizza.setTopping("Vegtables");
      
    }

    @Override
    public Pizza getPizza() {
       return pizza;
       
    }

}
