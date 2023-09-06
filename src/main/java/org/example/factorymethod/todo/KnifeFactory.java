package org.example.factorymethod.todo;

public class KnifeFactory {

    Knife createKnife(String knifeType) {

        if (knifeType.equals("BUDGET_KNIFE")) {
            return new BudgetKnife("Awesome Budget Knife");
        } else if (knifeType.equals("Chef's Knife")) {
            return new ChefsKnife("Awesome Chef's Knife");
        } else {
            return null;
        }

    }
}