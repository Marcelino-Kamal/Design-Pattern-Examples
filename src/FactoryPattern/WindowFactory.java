package FactoryPattern;

public class WindowFactory implements AbstractFactory{
    public WindowFactory(){
        getWindows();
        getbuttons();
    }
    @Override
    public WindowFamily getWindows() {

        return new McWindow();
    }

    @Override
    public ButtonsFamily getbuttons() {

        return new WindowButton();
    }
}
