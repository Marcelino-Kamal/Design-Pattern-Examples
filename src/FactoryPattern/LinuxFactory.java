package FactoryPattern;

public class LinuxFactory implements AbstractFactory{

    public LinuxFactory(){
        getWindows();
        getbuttons();
    }

    @Override
    public WindowFamily getWindows() {
        return new LinuxWindow();
    }

    @Override
    public ButtonsFamily getbuttons() {
        return new LinuxButton();
    }
}
