package org.java.inheritance.shop;

import java.math.BigDecimal;

public class Television extends Product{
    // ATTRIBUTI
    private int size;
    private boolean smart;

    // COSTRUTTORI

    public Television(String name, String description, BigDecimal price, BigDecimal vat, int size, boolean smart) throws IllegalArgumentException {
        super(name, description, price, vat);
        validateSize(size);
        this.size = size;
        this.smart = smart;
    }


    //GETTER E SETTER

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws IllegalArgumentException{
        validateSize(size);
        this.size = size;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    //METODI

    private void validateSize(int size) throws IllegalArgumentException{
        if(size < 0) {
            throw new IllegalArgumentException(" Size not valid");
        }
    }


    @Override
    public String toString() {
        return super.toString() + " Size: " + getSize() + " Smart: " + isSmart();
    }
}
