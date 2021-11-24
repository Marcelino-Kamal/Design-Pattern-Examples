package FactoryPattern;

public class McWindow implements WindowFamily{
    public McWindow(){
        Window();
    }
    @Override
    public void Window() {
        System.out.println("I am a Mc Window");
    }
}
