package org.java.inheritance.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String nameInput = scanner.nextLine();
        System.out.print("Description: ");
        String descriptionInput = scanner.nextLine();

        BigDecimal price = null;
        while (price == null) {
            System.out.print("Price: ");
            String priceInput = scanner.nextLine();
            try {
                price = new BigDecimal(priceInput);
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
        }

        BigDecimal vat = null;
        while (vat == null){
            System.out.print("Vat: ");
            String vatInput = scanner.nextLine();
            try{
                vat = new BigDecimal(vatInput);
            } catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }

        try {
            System.out.println("Category: (smartphone/television/headphones)");
            String category = scanner.nextLine();
            if (category.equalsIgnoreCase("smartphone")) {
                System.out.println("Memory: (16/32) ");
                String memoryInput = scanner.nextLine();
                Smartphone smartphone = new Smartphone(nameInput,descriptionInput,price,vat,memoryInput);
                System.out.println(smartphone.toString());
                System.out.println("Hai la carta fedeltà per un ulteriore sconto? (y/n)");
                String answer = scanner.nextLine();
                switch (answer){
                    case "y":
                        System.out.println(smartphone.getPriceSconted());
                }
            } else if(category.equalsIgnoreCase("television")) {
                System.out.print("Size: ");
                int sizeInput = scanner.nextInt();
                System.out.println("Smart? (true/false)");
                boolean smartInput = scanner.nextBoolean();
                Television television = new Television(nameInput,descriptionInput,price,vat,sizeInput,smartInput);
                System.out.println(television.toString());
            } else if (category.equalsIgnoreCase("headphones")) {
                System.out.print("Color: ");
                String colorInput = scanner.nextLine();
                System.out.println("Wireless or Wired?");
                String choiceInput = scanner.nextLine();
                Headphones headphones = new Headphones(nameInput,descriptionInput,price,vat,colorInput,choiceInput);
                System.out.println(headphones.toString());
            } else {
                System.out.println("Sbagliato");
                System.out.println("Selezionare una categoria tra quelle proposte");

            }
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Sorry invalid parameters: " + illegalArgumentException.getMessage());
        }





        scanner.close();
    }
}
