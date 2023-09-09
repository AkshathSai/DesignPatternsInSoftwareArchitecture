package org.example.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.Knife;
import org.example.factory.model.KnifeType;

@Slf4j
public abstract class KnifeStore {

    public Knife orderKnife(KnifeType knifeType) {
        log.info("Received order for {} ", knifeType);
        return createKnife(knifeType);
    }

    public abstract Knife createKnife(KnifeType knifeType);

}