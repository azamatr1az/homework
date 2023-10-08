package com.telran.org.HomeWorkATM;

import com.telran.org.HomeWorkATM.ATM;
import com.telran.org.HomeWorkATM.Converter;
import com.telran.org.HomeWorkATM.CreditCard;

public class IngBankAtm extends ATM implements Converter {

        private String name;
        private double balanceUSD;

    public String getName() {
        return name;
    }

    public double getBalanceUSD() {
        return balanceUSD;
    }

    public IngBankAtm(String name, double balanceUSD) {
            this.name = name;
            this.balanceUSD = balanceUSD;
        }

    @Override
    public void withdraw(CreditCard card, double amount) {

            if (verifyPin(card, card.getPin())) {
                if (amount > 0 && balanceUSD >= amount) {
                    balanceUSD -= amount;
                    card.withdraw(amount);
                } else {
                    System.out.println("error , not enough money in ATM.");
                }
            } else {
                System.out.println("error , wrong Pin");
            }
        }


    @Override
        public void depositMoney(CreditCard card, double amount) {
            if (verifyPin(card, card.getPin())) {
                if (amount > 0) {
                    balanceUSD += amount;
                    card.deposit(amount);
                } else {
                    System.out.println("Error depositing funds. The sum must be positive.");
                }
            } else {
                System.out.println("Error depositing funds. Invalid PIN");
            }
        }

    @Override
    public double convert(double amountInEUR) {
        double exchangeRate = 1.18;
        return amountInEUR * exchangeRate;
    }
}
