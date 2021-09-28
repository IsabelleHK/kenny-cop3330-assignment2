/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex38;
import java.util.*;
public class Main {

    //Integer array
    public static Integer[] evenNumberList(String list[]) {
        ArrayList<Integer> newList = new ArrayList<>();

        //loop for length of input
        for(int i = 0; i < list.length; i++){
            //for index length of length; parse in list
            int num = Integer.parseInt(list[i]);
            //Mode to get remainder; if 0 then even
            if(num % 2 == 0){
                newList.add(num);
            }
        }
        //convert
        Integer[] numberList = new Integer[newList.size()];
        numberList = newList.toArray(numberList);

        return numberList;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userNumbers = input.nextLine();

        //split function to split where null/empty space is
        String list[] = userNumbers.split(" ");

        //call function and create array
        Integer evenList[] = evenNumberList(list);

        System.out.print("The even numbers are ");
        for(int i = 0; i < evenList.length; i++){
            if(i < (evenList.length - 1)){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }
}

