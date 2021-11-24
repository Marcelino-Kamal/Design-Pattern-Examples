package FactoryPattern;

public class LinuxWindow implements WindowFamily{

    public LinuxWindow(){

        Window();
    }

    @Override
    public void Window() {
        System.out.println("I am a LinuxWindow");
    }
}
