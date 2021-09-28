/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex25;
import java.util.Scanner;
public class Main
{
    //function for passswordValidator
    private static int passwordValidator(String password){
        int passwordScore = 0;

        //has to be greater or equal to 8
        if(password.length() >= 8)
            passwordScore += 1;
        //less than 8
        else
            passwordScore += 0;

        //has a number
        if(password.matches("(?=.*[0-9]).*"))
            passwordScore += 0;
        //has a letter
        if(password.matches("(?=.*[a-z]).*"))
            passwordScore +=1;
        //has a special character
        if(password.matches("(?=.*[~!@#$%^&*()_-]).*"))
            passwordScore += 1;

        return passwordScore;
    }

    public static void main(String[] args)
    {
        //user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = userInput.nextLine();

        String strength;

        //switch statement; score 0-3
        switch (passwordValidator(password))
        {
            //less than 8 and only numbers
            case 0:
                strength = "very weak";
                break;
            //less than 8 but has a letter
            case 1:
                strength = "weak";
                break;
            //at least 8, has a number, and a letter
            case 2:
                strength = "strong";
                break;
            //at least 8, number, letters, and special
            case 3:
                strength = "very strong";
                break;
            //bad input
            default:
                strength = "very weak";
        }

        System.out.println("The password: " + password + " is a " + strength + " password");

    }
}
