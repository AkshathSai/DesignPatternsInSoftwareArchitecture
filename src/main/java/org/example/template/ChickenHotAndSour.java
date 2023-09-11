package org.example.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChickenHotAndSour extends Soup {

    public ChickenHotAndSour() {
        log.info("Received Chicken Soup order! Preparing stove and container with water");
    }

    @Override
    void pourAddInsWhileStirring() {
        log.info("Adding Ginger, Garlic, Herbs & Spices  whilst stirring...");
    }

    @Override
    void addProtein() {
        log.info("Adding Chicken & scrambled Egg...");
    }

    @Override
    void addSalt() {
        log.info("Adding Salt to taste...");
    }

    @Override
    void addGarnish() {
        log.info("Adding Pepper & Veggies...");
    }
}
