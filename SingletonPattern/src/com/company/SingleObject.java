package com.company;

public class SingleObject {

    // this implementation is not thread safe

    private static SingleObject singleObject;

    //make the constructor private so that this class cannot be instantiated
    private SingleObject(){
    }

    // create an object of SingleObject and get the only object available
    public static SingleObject getInstance(){
        if (singleObject == null){
            singleObject = new SingleObject();
        }
        return singleObject;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
