package BuilderPattern;

public class MeatPizzaBuilder implements PizzaBuilder {
    Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("Stuffed crust");
    }

    @Override
    public void buildSauce() {
       pizza.setSauce("Ranch Sauce");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Peppronie & Chicken");
    }

    @Override
    public Pizza getPizza() {
       return pizza;
    }
    

}
