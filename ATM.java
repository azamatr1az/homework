package com.telran.org.HomeWorkATM;

public  abstract class ATM {


    public abstract void withdraw(CreditCard card, double amount);
    public abstract void depositMoney(CreditCard card, double amount);
    public boolean verifyPin(CreditCard card, int enteredPin) {
        return card.verifyPin(enteredPin);

    }



}
