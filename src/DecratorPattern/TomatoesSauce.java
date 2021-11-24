package DecratorPattern;

public class TomatoesSauce extends Decarator{
    public TomatoesSauce(Pizza x) {
        super(x);
        excute();
    }

    @Override
    public void excute() {
        System.out.println("Tomatoes Sauce been added");
    }
}
