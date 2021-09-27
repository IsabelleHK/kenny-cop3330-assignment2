package com.ex26;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double b, double i,double p){
        i = i/100;
        double n = -(1.0/30.0) * (Math.log(1 + b/p * (1 - Math.pow((1 + i/365.0),30))) / Math.log(1 + i/365.0));

        return n;
    }
}

