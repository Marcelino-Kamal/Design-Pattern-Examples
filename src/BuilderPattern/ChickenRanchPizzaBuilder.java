package BuilderPattern;

public class ChickenRanchPizzaBuilder implements Pizza {


    @Override
    public void addBread() {
        System.out.println("add Bread");
    }
    public void addchicken(){
        System.out.println("add Chicken");
    }
    public void getproduct(){
        addBread();
        addchicken();
    }
}
