/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */
package com.ex31;
import java.util.Scanner;
public class Main {

    public static int targetHeart(int restingHR, int age, double intensity){
        double heartRate = (((220 - age) - restingHR) * intensity) + restingHR;
        return (int) heartRate;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean error = false;

        while(true) {
            try {
                System.out.print("Resting Pulse: ");
                int restingHR = Integer.parseInt(input.next());
                System.out.print("Age: ");
                int age = Integer.parseInt(input.next());
                System.out.print("Resting Pulse: " + restingHR + "\tAge: " + age);
                System.out.println();
                System.out.println("Intensity \t| Rate");
                System.out.print("------------|---------------\n");
                for (int i = 55; i <= 95; i += 5) {
                    System.out.print(i + "% \t\t|");
                    double d = i;
                    System.out.println(" " + targetHeart(restingHR, age, d / 100) + " bpm");
                }
                error = true;
            }
            catch (ArithmeticException e) {
            }
                catch(NumberFormatException e){
            }
            if (error) {
                break;
            }
        }
    }
}
