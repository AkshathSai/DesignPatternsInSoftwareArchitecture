package org.example.factory.factoryobject;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.Knife;
import org.example.factory.model.KnifeType;

@Slf4j
public class TestKnifeStore {

    public static void main(String[] args) {

        KnifeFactory knifeFactory = new KnifeFactory();
        KnifeStore knifeStore = new KnifeStore(knifeFactory);
        Knife budgetKnife = knifeStore.orderKnife(KnifeType.BUDGET_KNIFE);
        log.info(budgetKnife.toString());
        Knife chefsKnife = knifeStore.orderKnife(KnifeType.CHEFS_KNIFE);
        log.info(chefsKnife.toString());
    }
}
