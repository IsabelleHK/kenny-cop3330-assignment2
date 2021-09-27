/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex32;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static int easyMode(){
        int num = (int) (Math.random() * 10 + 1);
        return num;
    }
    public static int mediumMode(){
        int num = (int) (Math.random() * 100 + 1);
        return num;
    }
    public static int hardMode(){
        int num = (int) (Math.random() * 1000 + 1);
        return num;
    }
    public static void main(String[] args) {
       System.out.println("Let's play Guess the Number!");
       int num;
       Scanner input = new Scanner(System.in);
       int user;
       int score=0;
       int mode;
            while(true){
                score = 0;
                System.out.print("Enter the difficulty level(1, 2, or  3): ");
                mode = input.nextInt();

                if(mode==1)
                    num = easyMode();
                else if(mode == 2)
                    num = mediumMode();
                else
                    num = hardMode();

                System.out.print("I have my number. What's your guess?: ");
                do{
                    user = input.nextInt();
                    score++;
                    if (user == num){
                        System.out.println("You got it in " + score + "  guesses!");
                    }
                    else if (user < num)
                        System.out.println("Too low. Guess again: ");
                    else if (user > num)
                        System.out.println("Too high. Guess again: ");

                } while (user != num);

                System.out.print("\nDo you wish to play again (Y/N)?  ");
                char play=input.next().charAt(0);
                if(play=='N' || play=='n')
                    break;
        }
    }
}
