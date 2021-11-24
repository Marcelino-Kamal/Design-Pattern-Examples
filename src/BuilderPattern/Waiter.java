package BuilderPattern;

public class Waiter {

    void makePizza(Pizza p){
      if(p instanceof ChickenRanchPizzaBuilder){
          ((ChickenRanchPizzaBuilder) p).getproduct();
          System.out.println("ChickenPizza is Done");
      }
      else if(p instanceof SeaFoodPizzaBuilder){
         ((SeaFoodPizzaBuilder) p).getproduct();
         System.out.println("SeaFood Pizza is Done");
      }
    }
}
