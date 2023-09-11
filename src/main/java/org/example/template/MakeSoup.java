package org.example.template;

public class MakeSoup {

    public static void main(String[] args) {

        Soup vegSoup = new VegCorn();
        vegSoup.makeRecipe();

        Soup nonVegSoup = new ChickenHotAndSour();
        nonVegSoup.makeRecipe();
    }
}
