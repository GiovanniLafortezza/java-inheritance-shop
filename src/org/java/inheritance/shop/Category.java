package org.java.inheritance.shop;

public class Category {
    private String name;
    private String description;

    // COSTRUTTORI

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // GETTER E SETTER

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
