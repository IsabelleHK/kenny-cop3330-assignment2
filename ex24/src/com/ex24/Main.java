/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex24;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static boolean isAnagram(char[] str1, char[] str2)
    {
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static void main(String args[])
    {
        System.out.println("Anagram (noun) - a word or phrase made by transposing the letters of another word or phrase");
        System.out.println("Example: \"note\" and \"tone\"\n");
        System.out.println("Enter two wacky string and I'll tell you if they are anagrams: ");

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String userStr1 = userInput1.nextLine();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Enter second string: ");
        String userStr2 = userInput2.nextLine();

        char[] first = userStr1.toCharArray();
        char[] second = userStr2.toCharArray();

        if (isAnagram(first, second))
            System.out.println("The two strings are anagram of each other!");
        else
            System.out.println("The two strings are not anagram of each other!");
    }
}
