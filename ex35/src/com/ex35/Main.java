/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex35;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> userNames = new ArrayList<String>();
        Random num = new Random();
        String name;

        do {
            System.out.print("Enter a name : ");
            name = input.nextLine();
            userNames.add(name);
        }while(!name.isEmpty());
        userNames.remove(userNames.size() - 1);
        System.out.println("The winner is " + userNames.get(num.nextInt(userNames.size())));
    }
}
