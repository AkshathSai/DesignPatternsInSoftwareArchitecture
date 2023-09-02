package org.example.singleton;

public class NaiveSingleton {

    private static NaiveSingleton instance;
    public String value;

    //Private constructor so that it couldn't be accessed outside the class
    private NaiveSingleton(String value) {
        this.value = value;
    }

    /**
     * Public method that creates an instance of the class but only if
     * the instance doesn't exist already
     */
    public static NaiveSingleton getInstance(String value) {
        if (instance == null) {
            instance = new NaiveSingleton(value);
        }
        return instance;
    }

}
