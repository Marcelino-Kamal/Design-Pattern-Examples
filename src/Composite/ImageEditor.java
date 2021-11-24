package Composite;



public class ImageEditor {


    public static void main(String[] args) {

        CompoundGraphic all= new CompoundGraphic();
        CompoundGraphic all2=new CompoundGraphic();
        all2.add(new Circle(1,3,4));
        all2.add(new Circle(1,3,8));
        all.add(new Dot(3,4));
        all.add(new Circle(4,5,7));
        all.add(all2);
        all.draw();
        all2.draw();

    }
}
