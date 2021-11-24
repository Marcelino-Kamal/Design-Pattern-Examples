package FactoryPattern;

public class bird implements Animals {


    public void functioncat()
    {
        head();
        body();
        sound();
        legs();
    }
    @Override
    public void head() {
        System.out.println("bird Head");
    }

    @Override
    public void body() {System.out.println("bird body");}

    @Override
    public void sound() {
        System.out.println("sewsew");
    }

    @Override
    public void legs() {
        System.out.println("bird legs");
    }
}
