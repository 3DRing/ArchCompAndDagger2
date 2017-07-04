package com.ringov.archcompsanddagger2.model;

/**
 * Created by Sergey Koltsov on 06.06.2017.
 */

public class User {

    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
