package CompositePattern;

public class Main {

    public static void main(String[] args) {
        Paper p1 = new Paper("Documents", 100);
        Paper p2 = new Paper("Images", 20);

        Box b1 = new Box("Box1");
        b1.add(p1);
        b1.add(p2);

        Paper p3 = new Paper("Notes",50);
        Container c1 = new Container("c1");
         c1.add(b1);
         c1.add(p3);

         c1.display(0);
          System.out.println("Total weight: " + c1.getWeight() + " g");
         
        
        
    }
}
