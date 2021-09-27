/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex33;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.print("What is your question?\n> ");
        String question = input.nextLine();

        String[] answers = {"\nYes", "\nNo", "\nMaybe", "\nAsk again later."};

        int i = (int)(Math.random() * (4-0)) ;
        System.out.println(answers[i]);
    }
}
