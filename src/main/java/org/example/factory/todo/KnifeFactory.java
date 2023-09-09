package org.example.factory.todo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeFactory {

    Knife createKnife(KnifeType knifeType) {

        log.info("Received order for {} ", knifeType);

        if (knifeType.equals(KnifeType.BUDGET_KNIFE)) {
            return new BudgetKnife("Awesome Budget Knife's ready!!");
        } else if (knifeType.equals(KnifeType.CHEFS_KNIFE)) {
            return new ChefsKnife("Awesome Chef's Knife");
        } else {
            return null;
        }

    }
}
