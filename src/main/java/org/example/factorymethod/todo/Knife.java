package org.example.factorymethod.todo;

import lombok.Data;

@Data
public class Knife {

    private String name;

    public Knife(String name) {
        this.name = name;
    }
}
