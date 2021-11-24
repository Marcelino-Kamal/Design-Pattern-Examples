package FactoryPattern;

import java.util.Random;

public class RandomFactory implements AnimalFactory {

    public RandomFactory(){
        createAnimals();
    }
    @Override
    public  Animals createAnimals() {

        Animals[] list={new Cat(),new Dog(),new bird()};

       int x=new Random().nextInt(list.length);

       Animals y=list[x];

       if(y instanceof Cat){
           ((Cat) y).functioncat();
           return y;
       }
       else if(y instanceof Dog){
           ((Dog) y).functioncat();
            return y;
       }
       else if(y instanceof bird){
           ((bird) y).functioncat();
            return y;
       }
       return y ;
    }
}
