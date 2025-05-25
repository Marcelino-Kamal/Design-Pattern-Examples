package AdapterPattern;

public class Adapter implements EuropeWallPlugin{

    private USPlugIn a;
    public Adapter(USPlugIn a){
        this.a=a;
    }

    @Override
    public void request() {
        this.a.specifcRequest();

    }
}
