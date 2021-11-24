package FacadePattern;

public class Facade {
    public void CreateHouse(){
        new House(new foundation(new Apartements(new Plumbing(),new Wires())));
        System.out.println("Gratz house is Created");
    }
    public void CreateApartement(){
        new Apartements(new Plumbing(),new Wires());
        System.out.println("gratz Apartement is created");
    }
}
