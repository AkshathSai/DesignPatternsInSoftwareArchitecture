package org.example.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Soup {

    public final void makeRecipe() {
        boilWater();
        pourAddInsWhileStirring();
        addProtein();
        addSalt();
        addGarnish();
        serve();
    }

    private void boilWater() {
        log.info("Boiling Water...");
    }

    abstract void pourAddInsWhileStirring();
    abstract void addProtein();
    abstract void addSalt();
    abstract void addGarnish();
    private void serve() {
        log.info("Your hot Soup's ready to eat!");
    }
}
