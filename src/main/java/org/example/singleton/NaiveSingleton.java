package org.example.singleton;

public class NaiveSingleton {

    private static NaiveSingleton instance;

    //Private constructor so that it couldn't be accessed outside the class
    private NaiveSingleton() {
    }

    /**
     * Public method that creates an instance of the class but only if
     * the instance doesn't exist already
     */
    public static NaiveSingleton getInstance() {
        if (instance == null) {
            instance = new NaiveSingleton();
        }
        return instance;
    }

}
