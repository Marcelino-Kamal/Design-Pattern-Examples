package AdapterPattern;


public class MainClient {
    public static void main(String[] args) {
        USPlugIn US = new USPlugIn();

        EuropeWallPlugin adp = new Adapter(US);

        adp.request();

        
    }
}
