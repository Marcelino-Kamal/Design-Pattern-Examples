package FactoryPattern;

public class WindowButton implements ButtonsFamily{
        public WindowButton(){
            Button();
        }
    @Override
    public void Button() {
        System.out.println("I am a Mc Button");
    }
}
