package FactoryPattern;

public class Cat implements Animals {


    public void functioncat()
    {
        head();
        body();
        sound();
        legs();
    }
    @Override
    public void head() { System.out.println("Cat head");}
    @Override
    public void body() {
        System.out.println("Cat body");
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void legs() {
        System.out.println("cat legs");
    }
}
