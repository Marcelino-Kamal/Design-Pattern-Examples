package DecratorPattern;

public class Cheese extends Decarator{
    public Cheese(Pizza x) {
        super(x);
        excute();
    }

    @Override
    public void excute() {
        System.out.println("cheese added");
    }
}
