package AdapterPattern;

/*Adapter Pattern:
Convert the interface of a class into another interface clients expect.
Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
To simplify how it works:
    similar to real life adapter,when you plug in the cable(iTarget) of 3line to convert it to 2 lines you use the adapter
    our Adapter divide into (internal process (adapter class) / the 3 line interface(adaptee Class) )
* */
public class MainClient {
    public static void main(String[] args) {
        USPlugIn US = new USPlugIn();

        EuropeWallPlugin adp = new Adapter(US);

        adp.request();

        
    }
}
