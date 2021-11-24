package FactoryPattern;

public class Dog implements Animals{

    public void functioncat()
    {
        head();
        body();
        sound();
        legs();
    }

    @Override
    public void head() {
        System.out.println("dog head");
    }

    @Override
    public void body() {
        System.out.println("Dog body");
    }

    @Override
    public void sound() {
        System.out.println("woof woof");
    }

    @Override
    public void legs() {
        System.out.println("Dog legs");
    }
}
