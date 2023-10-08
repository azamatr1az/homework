
package com.telran.org.HomeWorkATM;

import java.util.Scanner;

public class AtmApp {
    public static void main(String[] args) {

        SparkasseAtm sparkasseAtm = new SparkasseAtm("SparkasseAtm", 1000.0);
        VolksBankAtm volksBankAtm = new VolksBankAtm("VolksBankAtm", 2000.0);
        IngBankAtm ingBankAtm = new IngBankAtm("IngBankAtm", 3000.0);

        ATM[] atms   = {sparkasseAtm,volksBankAtm, ingBankAtm};

        CreditCard card = new CreditCard(1234567890, "2024", 500.0);

        ATM selectedATM = null;
        for (ATM atm : atms)
            if (atm instanceof Converter) {
                selectedATM = atm;
                break;
            }

        if (selectedATM == null) {
            System.out.println("None of the ATMs support currency conversion.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN code: ");
        int enteredPin = scanner.nextInt();

        if (selectedATM.verifyPin(card, enteredPin)) {
            System.out.println("Authorization was successful.");

            System.out.print("Enter the amount to withdraw in EUR: ");
            double amountInEUR = scanner.nextDouble();

            double amountInUSD = ((Converter) selectedATM).convert(amountInEUR);

            selectedATM.withdraw(card, amountInUSD);

            System.out.println("The Card information");
            System.out.println("Card number: " + card.getCardNumber());
            System.out.println("Card balance: " + card.getBalance() + " EUR");

            System.out.println("The  Bank information " + selectedATM.getClass().getSimpleName() + ":");
            System.out.println("The bank name: " + ((SparkasseAtm) selectedATM).getName());
            System.out.println("Баланс банкомата: " + ((SparkasseAtm) selectedATM).getBalanceUSD() + " USD");
        } else {
            System.out.println("Authorization failed. Invalid PIN code.");
        }

        }
    }
