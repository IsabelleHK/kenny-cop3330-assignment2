/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex37;
import java.util.*;
public class Main {

    public static String passwordGenerator(int size, int special, int nums){
        //Starting String before adding
        String password = "";

        //Available characters to choose from
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "~!@#$%^&*()_+-=?";
        String numbers = "0123456789";

        //random number generator to pick random character from string
        Random r = new Random();

        //new and empty character array list
        ArrayList<Character> character = new ArrayList<>();

        //fill special spaces with special characters
        //String specialCharacters = "~!@#$%^&*()_+-=?";
        for(int i=0; i<special; i++){
            character.add(specialCharacters.charAt(r.nextInt(specialCharacters.length())));
        }

        //fill num spaces with numbers
        //String numbers = "1234567890";
        for (int i=0; i<nums; i++){
            character.add(numbers.charAt(r.nextInt(numbers.length())));
        }

        //filling remaining space with letters
        //String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        for(int i=character.size(); i<size; i++){
            character.add(letters.charAt(r.nextInt(letters.length())));
        }

        //Shuffle Array list
        Collections.shuffle(character);

        //String[] to sting
        for(Character c : character) {
            password += Character.toString(c);
        }

        return password;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Using Integer.parseInt to ensure input is correct data type
        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(input.nextLine());

        //Using Integer.parseInt to ensure input is correct data type
        System.out.print("How many special characters? ");
        int special = Integer.parseInt(input.nextLine());

        //Using Integer.parseInt to ensure input is correct data type
        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(input.nextLine());

        System.out.println("Your password is " + passwordGenerator(size, special, numbers));
    }
}
