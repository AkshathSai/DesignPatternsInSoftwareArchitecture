package org.example.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        NaiveSingleton naiveSingleton = NaiveSingleton.getInstance();
        log.info("" + naiveSingleton.hashCode());
        NaiveSingleton naiveSingleton1 = NaiveSingleton.getInstance();
        log.info("" + naiveSingleton1.hashCode());

    }
}