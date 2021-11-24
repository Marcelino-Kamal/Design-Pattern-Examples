package DecratorPattern;

public class Chicken extends Decarator{
    public Chicken(Pizza x) {
        super(x);
        excute();
    }
    @Override
    public void excute() {
        System.out.println("add chicken");
    }
}
