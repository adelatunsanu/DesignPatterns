package com.company;

public class SingleObjectThreadSafe {

    private final static class SingletonHolder{
        public static final SingleObjectThreadSafe SINGLETON = new SingleObjectThreadSafe();
    }

    public static SingleObjectThreadSafe getInstance(){
        return SingletonHolder.SINGLETON;
    }

    public SingleObjectThreadSafe() {
    }
}
