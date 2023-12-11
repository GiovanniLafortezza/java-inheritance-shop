package org.java.inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product {
    //ATTRIBUTI
    private int codeImei;
    private String memory;

    //COSTRUTTORI


    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, String memory) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.codeImei = generateCode();
        this.memory = memory;
    }

    //GETTER e SETTER

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public int getCodeImei() {
        return codeImei;
    }

    //METODI

    private int generateCode() {
        Random generateCode = new Random();
        return generateCode.nextInt(10000000);
    }



    @Override
    public String toString() {
        return super.toString() + " Memory: " + getMemory() + " IMEI: " + getCodeImei();
    }
}
