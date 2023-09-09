package org.example.factory.factoryobject;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.KnifeType;

@Slf4j
public class KnifeStore {

    private final KnifeFactory knifeFactory;

    // require a KnifeFactory object to be passed to
    // this constructor
    public KnifeStore(KnifeFactory knifeFactory) {
        this.knifeFactory = knifeFactory;
    }

    public Knife orderKnife(KnifeType knifeType) {
        log.info("Placed order for {} ", knifeType);

        Knife knife;

        //Get Knife from Factory - use the create method in factory
        knife = knifeFactory.createKnife(knifeType);

        // prepare the knife
        knife.sharpen();
        knife.polish();
        knife.pack();

        // handover to buyer/consumer
        return knife;
    }

}
