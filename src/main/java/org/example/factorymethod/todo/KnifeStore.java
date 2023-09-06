package org.example.factorymethod.todo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeStore {

    KnifeFactory knifeFactory = new KnifeFactory();

    /*public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }*/

    public KnifeStore(){}

    public void orderKnife() {

        Knife knife;

        //Get Knife from Factory
        knife = knifeFactory.createKnife(ENUMS.BUDGET_KNIFE.toString());

        //pack it and handover to buyer/consumer
        log.info(knife.toString());
    }

}
