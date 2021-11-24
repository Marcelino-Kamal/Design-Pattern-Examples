package AdapterPattern;

public class Adapter implements iTarget{

    private Adaptee a;
    public Adapter(Adaptee a){
        this.a=a;
    }

    @Override
    public void request() {
        this.a.specifcRequest();

    }
}
