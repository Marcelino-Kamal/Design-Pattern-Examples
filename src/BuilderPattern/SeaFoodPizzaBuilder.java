package BuilderPattern;

public class SeaFoodPizzaBuilder implements Pizza{


    @Override
    public void addBread() {
        System.out.println("add Bread");
    }
    public void addSeaFood(){
        System.out.println("add Seafood");
    }
    public void getproduct(){
        addBread();
        addSeaFood();
    }
}
