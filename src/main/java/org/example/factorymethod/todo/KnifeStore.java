package org.example.factorymethod.todo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeStore {

    KnifeFactory knifeFactory;

    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    public void orderKnife() {

        Knife knife;

        //Get Knife from Factory
        knife = knifeFactory.createKnife(ENUMS.BUDGET_KNIFE.toString());

        //deliver it
        log.info(knife.toString());
    }

}
