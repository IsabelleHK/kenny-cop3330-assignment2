/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex30;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {
    private static String input = "";
    public static void main(String[] args) {
        Integer[] size = {1,2,3,4,5,6,7,8,9,10,11,12};
        Integer input = (Integer) JOptionPane.showInputDialog(null, "size", "number", JOptionPane.QUESTION_MESSAGE, null, size, size[0]);

        multiplicationTable(input);
    }

    public static void multiplicationTable(int size) {
        //For top row header
        for(int i = 1; i<=size;i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //For left column header
        for(int i = 2 ;i<=size;i++) {
            System.out.print(i +"\t");

            //multiplication magic
            //required nested loop
            for(int j=2;j<=size;j++) {
                System.out.print(i*j +"\t");
            }
            System.out.println();
        }
    }
}
