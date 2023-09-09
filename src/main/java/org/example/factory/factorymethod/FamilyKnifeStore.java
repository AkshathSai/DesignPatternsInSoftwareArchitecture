package org.example.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.KnifeType;

@Slf4j
public class FamilyKnifeStore extends KnifeStore {
    @Override
    public Knife createKnife(KnifeType knifeType) {
        log.info("Preparing order for {} in FamilyKnifeStore", knifeType);

        if (knifeType.equals(KnifeType.REGULAR_FAMILY_KNIFE)) {
            return new RegularFamilyKnife("Awesome new Regular Family Knife's ready!!");
        }
        //..more types
        return null;
    }
}
