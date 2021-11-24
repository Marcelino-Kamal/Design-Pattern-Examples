package DecratorPattern;

public class PlainPizza implements  Pizza{
    public PlainPizza(){
        excute();
    }
    @Override
    public void excute() {
        System.out.println("Plain pizza added");
    }
}
