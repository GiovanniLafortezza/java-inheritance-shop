package org.java.inheritance.shop;

import java.math.BigDecimal;

public class Headphones extends Product{
    private String color;
    private String choice;

    // COSTRUTTORI
    public Headphones(String name, String description, BigDecimal price, BigDecimal vat, String color, String choice) throws IllegalArgumentException {
        super(name, description, price, vat );
        this.color = color;
        this.choice = choice;
    }

    //GETTER E SETTER


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    // METODI


    @Override
    public String toString() {
        return super.toString() + " Color: " + getColor() + " " + getChoice();
    }
}
