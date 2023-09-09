package org.example.factory.factoryobject;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.Knife;
import org.example.factory.model.KnifeType;

@Slf4j
public class KnifeFactory {

    Knife createKnife(KnifeType knifeType) {

        log.info("Received order for {} ", knifeType);

        if (knifeType.equals(KnifeType.BUDGET_KNIFE)) {
            return new BudgetKnife("Awesome Budget Knife's ready!!");
        } else if (knifeType.equals(KnifeType.CHEFS_KNIFE)) {
            return new ChefsKnife("Awesome Chef's Knife's ready!!");
        } else {
            return null;
        }

    }
}
