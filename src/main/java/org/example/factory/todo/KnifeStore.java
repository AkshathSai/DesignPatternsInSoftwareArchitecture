package org.example.factory.todo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeStore {

    final KnifeFactory knifeFactory;

    /*public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }*/

    public KnifeStore() {
        this.knifeFactory = new KnifeFactory();
    }

    public void orderKnife() {

        Knife knife;

        //Get Knife from Factory
        knife = knifeFactory.createKnife(KnifeType.BUDGET_KNIFE);

        //pack it and handover to buyer/consumer
        log.info(knife.toString());
    }

}
