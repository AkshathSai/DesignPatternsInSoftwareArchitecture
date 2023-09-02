package org.example.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("Some value");
        log.info("{} ", naiveSingleton.value);
        NaiveSingleton naiveSingleton1 = NaiveSingleton.getInstance("Some other value");
        log.info("{} ", naiveSingleton1.value);

        Thread thread1 = new Thread(() -> {
            Singleton singleTon1 = Singleton.getInstance("ABC");
            log.info("{} ", singleTon1.value);
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance("DEF");
            log.info("{} ", singleton2.value);
        });

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(() -> {
            NaiveSingleton naiveSingleton2 = NaiveSingleton.getInstance("Yet another value");
            log.info("{} ", naiveSingleton2.value);
        });

        Thread thread4 = new Thread(() -> {
            NaiveSingleton naiveSingleton3 = NaiveSingleton.getInstance("Gosh! Another value?");
            log.info("{} ", naiveSingleton3.value);
        });

        thread3.start();
        thread4.start();
    }
}