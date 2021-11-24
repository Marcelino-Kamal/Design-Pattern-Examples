package Composite;

public class Circle extends Dot{
    int radius;
    public Circle(int x, int y,int radius) {
        super(x, y);
        this.radius=radius;
    }
    public void draw(){
        System.out.println(x+" "+y+" Radius "+radius);
    }
}
