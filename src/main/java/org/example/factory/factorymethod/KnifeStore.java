package org.example.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeStore {

    private final KnifeFactory knifeFactory;

    // require a KnifeFactory object to be passed to
    // this constructor
    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    /*public KnifeStore() {
        this.knifeFactory = new KnifeFactory();
    }*/

    public void orderKnife(KnifeType knifeType) {
        log.info("Placed order for {} ", knifeType);

        Knife knife;

        //Get Knife from Factory - use the create method in factory
        knife = knifeFactory.createKnife(knifeType);

        // prepare the knife
        knife.sharpen();
        knife.polish();
        knife.pack();

        // handover to buyer/consumer
        log.info(knife.toString());
    }

}
