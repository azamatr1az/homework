package com.telran.org.homeework_javapro;

public class HomeWorkPhone {
    public static void main(String[] args) {

        Phone phoneNumber1 = new Phone("111 111 111", "Samsung Galaxy S23", 100);



        Phone phoneNumber2 = new Phone("222 222 222", "iPhone 13", 50);



        Phone phoneNumber3 = new Phone("333 333 333", "GiPhone 13 Promax", 200);

        System.out.println("\n telephone info:");
        System.out.println("telephone  1:");
        System.out.println("number: " + phoneNumber1.getNumber());
        System.out.println("model: " + phoneNumber1.getModel());
        System.out.println("weight: " + phoneNumber1.getWeight());

        System.out.println("\nTelephone 2:");
        System.out.println("number: " + phoneNumber2.getNumber());
        System.out.println("model: " + phoneNumber2.getModel());
        System.out.println("weight: " + phoneNumber2.getWeight());

        System.out.println("\ntelephone 3:");
        System.out.println("number: " + phoneNumber3.getNumber());
        System.out.println("model: " + phoneNumber3.getModel());
        System.out.println("weight: " + phoneNumber3.getWeight());

        System.out.println("");


        phoneNumber1.receiveCall("Alex");
        phoneNumber2.receiveCall("Azamat");
        phoneNumber3.receiveCall("Davud");
    }

}
