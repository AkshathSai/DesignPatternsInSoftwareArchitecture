package org.example.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.Knife;
import org.example.factory.model.KnifeType;

@Slf4j
public class QualityKnifeStore extends KnifeStore {

    @Override
    public Knife createKnife(KnifeType knifeType) {
        log.info("Preparing order for {} in QualityKnifeStore", knifeType);

        if (knifeType.equals(KnifeType.QUALITY_CHEFS_KNIFE)) {
            return new QualityChefsKnife("Awesome new Quality Chef's Knife's ready!!");
        } else if (knifeType.equals(KnifeType.QUALITY_SHARP_KNIFE)) {
            return new QualitySharpKnife("Awesome new Quality Sharp Knife's ready!!");
        }
        return null;
    }

}
