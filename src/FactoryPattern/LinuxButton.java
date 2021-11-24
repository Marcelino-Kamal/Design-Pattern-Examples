package FactoryPattern;

public class LinuxButton implements ButtonsFamily {

    public LinuxButton(){
        Button();

    }
    @Override
    public void Button() {
        System.out.println("I am a Linux Button");

    }
}
