package org.example.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VegCorn extends Soup {

    public VegCorn() {
        log.info("Received Veg Soup order! Preparing stove and container with water");
    }

    @Override
    void pourAddInsWhileStirring() {
        log.info("Adding Vegies, Herbs & Spices  whilst stirring...");
    }

    @Override
    void addProtein() {
        log.info("Adding Green peas and corn...");
    }

    @Override
    void addSalt() {
        log.info("Adding Salt to taste...");
    }

    @Override
    void addGarnish() {
        log.info("Adding Toasted Potato Strips...");
    }
}
