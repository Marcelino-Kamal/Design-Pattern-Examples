package com.singletonPattern;

/* Not recommend as you have only one instance and cant create anymore instance in future so only use if you 100% sure you only need
* one instance of this class
* Ensure a class has only one instance and provide a global point of access to it
* Not Recommended in Programming*/


public class singleton {
    private static singleton _instance;

    private singleton(){
        System.out.println("Hello i am Singlton pattern");
    }
    public static singleton getInstance(){
        if(_instance==null){
            _instance=new singleton();
        }
        return _instance;
    }
}
