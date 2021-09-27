package com.ex26;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your balance? ");
        Scanner balance = new Scanner(System.in);
        double b = balance.nextInt();

        System.out.println("What is the APR on the card (as a percent)? ");
        Scanner APR = new Scanner(System.in);
        double i = APR.nextInt();

        System.out.println("What is the monthly payment you can make? ");
        Scanner monthlyPayment = new Scanner(System.in);
        double p = monthlyPayment.nextInt();

        System.out.println("\nIt will take you " + Math.ceil(PaymentCalculator.calculateMonthsUntilPaidOff(b,i,p)) + " months to pay off this card.");
    }
}
