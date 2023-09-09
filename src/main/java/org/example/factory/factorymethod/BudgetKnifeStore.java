package org.example.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.KnifeType;

@Slf4j
public class BudgetKnifeStore extends KnifeStore {

    // up to any subclass of KnifeStore to define this method
    @Override
    public Knife createKnife(KnifeType knifeType) {
        log.info("Preparing order for {} in BudgetKnifeStore", knifeType);

        if (knifeType.equals(KnifeType.BUDGET_CHEFS_KNIFE)) {
            return new BudgetChefsKnife("Awesome Budget Chef's Knife's ready!!");
        } else if (knifeType.equals(KnifeType.BUDGET_SHARP_KNIFE)) {
            return new BudgetSharpKnife("Awesome Budget Sharp Knife's ready!!");
        }
        //..more types
        return null;
    }
}
