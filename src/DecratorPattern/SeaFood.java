package DecratorPattern;

public class SeaFood extends Decarator{
    public SeaFood(Pizza x) {
        super(x);
        excute();
    }

    @Override
    public void excute() {
        System.out.println("SeaFood been added");
    }
}
