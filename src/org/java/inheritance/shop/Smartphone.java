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
        validateMemory(memory);
        this.codeImei = generateCode();
        this.memory = memory;
    }

    //GETTER e SETTER

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) throws IllegalArgumentException{
        validateMemory(memory);
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

    private void validateMemory(String memory) throws IllegalArgumentException{
        if(memory.isBlank() || (!memory.equals("16") && !memory.equals("32"))){
            throw new IllegalArgumentException("Memory not valid");
        }
    }

    @Override
    public BigDecimal getPriceSconted() {
        if (memory.equalsIgnoreCase("16")) {
            BigDecimal value5 = BigDecimal.valueOf(5);
            BigDecimal value100 = BigDecimal.valueOf(100);
            BigDecimal priceSconted = getFullPrice().multiply(value5);
            priceSconted = priceSconted.divide(value100);
            return getFullPrice().subtract(priceSconted);
        } else {
            return super.getPriceSconted();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Memory: " + getMemory() + " IMEI: " + getCodeImei();
    }
}
