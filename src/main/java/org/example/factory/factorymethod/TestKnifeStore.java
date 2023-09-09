package org.example.factory.factorymethod;

import lombok.extern.slf4j.Slf4j;
import org.example.factory.model.KnifeType;

@Slf4j
public class TestKnifeStore {

    public static void main(String[] args) {

        KnifeStore budgetKnifeStore = new BudgetKnifeStore();

        Knife budgetSharpKnife = budgetKnifeStore.orderKnife(KnifeType.BUDGET_SHARP_KNIFE);
        budgetSharpKnife.sharpen();
        budgetSharpKnife.polish();
        budgetSharpKnife.pack();
        log.info(budgetSharpKnife.toString());

        KnifeStore qualityKnifeStore = new QualityKnifeStore();

        Knife qualityChefsKnife = qualityKnifeStore.orderKnife(KnifeType.QUALITY_CHEFS_KNIFE);
        qualityChefsKnife.sharpen();
        qualityChefsKnife.polish();
        qualityChefsKnife.pack();
        log.info(qualityChefsKnife.toString());

        KnifeStore familyKnifeStore = new FamilyKnifeStore();
        Knife regularKnife = familyKnifeStore.orderKnife(KnifeType.REGULAR_FAMILY_KNIFE);
        regularKnife.sharpen();
        regularKnife.polish();
        regularKnife.pack();
        log.info(regularKnife.toString());
    }
}
