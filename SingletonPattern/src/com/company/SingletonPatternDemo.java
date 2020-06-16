package com.company;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        SingleObject obj1 = SingleObject.getInstance();
        obj1.showMessage();

        // it's going to return the same instance, we can prove it using the hashcode
        SingleObject obj2 = SingleObject.getInstance();
        obj2.showMessage();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

    }
}
