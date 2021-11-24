package DecratorPattern;

public abstract class Decarator implements Pizza{

    Pizza x;
    public Decarator(Pizza x){
        this.x=x;
    }
    @Override
    public void excute(){
        System.out.println("doing nothing");
    }

}
