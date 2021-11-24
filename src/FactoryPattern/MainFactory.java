package FactoryPattern;

/* Factory pattern used  to create instance of data(classes) that you not sure what data you want either randomly or in a balanced way
* Define Interface(SuperClass or Interface) for creating objects,but let subclasses decide which class to init
* Factory method let a class def the init for these subclasses
*
*
*
*
*
* Provide an interface for creating families of related or dependent objects without specifying their concrete classes
* so it is Basically same as Factory Pattern but it create multiple instance and we mostly use it when want group together bunch of things that makes sense together
* example used: Windows and linux UI*/


public class MainFactory {

    public static void main(String[] args) {
        new RandomFactory();
        new LinuxFactory();
        new WindowFactory();
    }

}
