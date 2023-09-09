package org.example.factory.todo;

public class TestKnifeStore {

    public static void main(String[] args) {

        //KnifeFactory knifeFactory =  new KnifeFactory();
        //KnifeStore knifeStore = new KnifeStore(knifeFactory);

        KnifeStore knifeStore = new KnifeStore();
        knifeStore.orderKnife();

    }
}
