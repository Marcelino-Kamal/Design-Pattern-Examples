package BuilderPattern;

public class PizzaDirector {

    private PizzaBuilder Builder;

    public PizzaDirector(PizzaBuilder pizzaBuilder){
        this.Builder=pizzaBuilder;
    }
    
    public void buildpizza(){
        Builder.buildDough();
        Builder.buildSauce();
        Builder.buildTopping();
    }

    public Pizza getPizza(){
        return Builder.getPizza();
    }
    
}
