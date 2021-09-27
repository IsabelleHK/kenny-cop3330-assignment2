/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */
package com.ex29;

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        //what is false
        boolean error=false;

        while(true)
        {
            //Java exceptions; try and catch
            //Try this block of code
            //If works; break
            //If fails, move to catch blocks
            try {
                System.out.print("What is the rate of return? ");
                int r = Integer.parseInt(input.next());
                int years = 72/r;
                System.out.println("It will take "+ years +" years to double your initial investment.");
                error = true;
            }

            //The block(s) of code for errors
            //NumberFormatExpection; attempt to convert string to number
            //Checks to see if new input works; break
            //New input fails; try again
            catch(NumberFormatException e){
                System.out.println("Sorry. That's not a valid input");
            }
            //ArthmeticException; attempting to divid by zero
            catch(ArithmeticException e){
                System.out.println("Sorry. That's not a valid input");
            }

            if(error){
                break;
            }

        }
    }
}


