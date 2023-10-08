package com.telran.org.HomeWorkATM;

public class CreditCard {
    private int pin;
    private String cardNumber;
    private double balance;

    public CreditCard(int pin, String cardNumber, double balance) {
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }



    public int getPin() {
        return pin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("sniyat " + amount + " Euro new balance: " + balance);
        } else {
            System.out.println("error , not enough money.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("deposited " + amount + " Euro. new Balance is : " + balance );
        } else {
            System.out.println("Error depositing funds. The sum must be positive.");
        }
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
}













