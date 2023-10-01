package com.telran.org.homeework_javapro;

public class Phone {

    private String number;
    private String model;
    private double weight;
    //private String name;
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void receiveCall(String s) {
        System.out.println("Calling " + s );
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall1(String callerName) {
        System.out.println("Звонит " + callerName);
    }
}


