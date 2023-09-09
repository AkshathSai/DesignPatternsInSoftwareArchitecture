package org.example.factory.factorymethod;

public class TestKnifeStore {

    public static void main(String[] args) {

        KnifeFactory knifeFactory =  new KnifeFactory();
        KnifeStore knifeStore = new KnifeStore(knifeFactory);
        knifeStore.orderKnife(KnifeType.BUDGET_KNIFE);
        knifeStore.orderKnife(KnifeType.CHEFS_KNIFE);

        /*KnifeStore knifeStore = new KnifeStore();
        knifeStore.orderKnife();*/

    }
}
