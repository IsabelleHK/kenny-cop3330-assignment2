/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */
package com.ex28;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        for(int i = 0; i <5; i++ ){
            System.out.println("Enter a number: ");
            a += input.nextInt();
        }
        System.out.println("\nThe total is: " + a);
    }
}
