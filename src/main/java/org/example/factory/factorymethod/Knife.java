package org.example.factory.factorymethod;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Knife {

    private String name;

    public Knife(String name) {
        this.name = name;
    }

    public void sharpen() {
        log.info("Sharpening Knife...");
    }

    public void polish() {
        log.info("Applying Polish...");
    }

    public void pack() {
        log.info("Packing final product...");
    }
}
