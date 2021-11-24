package Composite;

import java.util.ArrayList;


public class CompoundGraphic implements Graphic{
    ArrayList<Graphic>arr=new ArrayList<Graphic>();


    void add(Graphic child){
        arr.add(child);
    }
    void remove(Graphic child){
        arr.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child:arr) {
            child.move(x,y);
        }
    }

    @Override
    public void draw() {
        System.out.println("The Elements is :"+arr);
    }
}
