package FacadePattern;


/*Provide a unified interface to a set of interfaces in a subsystem. Façade defines a higher-level interface that makes the subsystem easier to use.
* so it basically simplify the interface for user like calculator you just press buttons and those button interact with all the classes behind it
* a Face for complex interaction
* */

public class MainFacadeClient {
    public static void main(String[] args) {
        Facade f=new Facade();
        f.CreateApartement();
        f.CreateHouse();
    }
}
