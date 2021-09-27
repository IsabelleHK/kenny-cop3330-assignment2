/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static String error = "";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine();

        System.out.println("Enter ZIP code name: ");
        String zip = input.nextLine();

        System.out.println("Enter employee ID: ");
        String employeeID = input.nextLine();

        validateInput(firstName, lastName, zip, employeeID);

    }

    //required validateInput functions that take all inputs and validates
    public static void validateInput(String firstName, String lastName, String zipCode, String employeeID){
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean id = validateEmployeeID(employeeID);
        boolean zip = validateZIP(zipCode);

        //checking status of errors
        if(first && last && zip && id){
            error = "There is no errors found.";
        }
        //Single print statement
        System.out.println(error);
    }
    //validate the first name; at least two characters and filled
    public static boolean validateFirstName(String firstName) {
        boolean validateStatus = true;
        if(firstName.length() < 2){
            //error message for incorrect format
            error = error + "The first name must be at least 2 characters long.\n";
            validateStatus = false;
        }
        if(firstName.length() == 0){
            //error message for incorrect format
            error = error + "The first name must be filled in.\n";
            validateStatus = false;
        }
        return validateStatus;
    }
    //validate the last name; at least two characters and filled
    public static boolean validateLastName(String lastName) {
        boolean validateStatus = true;
        if(lastName.length() < 2){
            //error message for incorrect format
            error = error + "The last name must be at least 2 characters long.\n";
            validateStatus = false;
        }
        if(lastName.length() == 0){
            //error message for incorrect format
            error = error + "The last name must be filled in.\n";
            validateStatus = false;
        }
        return validateStatus;
    }

    //validate zip code; at least 5 digits
    public static boolean validateZIP(String zip){
        //logical complement; true = not true
        //finding if there is a pattern between zip format and input
        if(!Pattern.matches("\\d{5}", zip)){
            //error message for incorrect format
            error = error + "The zipcode must be a 5 digit number.";
            return false;
        }
        return true;
    }

    //validate employeeID; two letters, hyphen, four numbers
    public static boolean validateEmployeeID(String employeeID){
        //logical complement; true = not true
        //finding if there is a pattern between employee ID format and input
        if(!Pattern.matches("[A-Z]{2}[-]{1}[0-9]{4}", employeeID)){
            //error message for incorrect format
            error = error + "The employee ID must be in the format of AA-1234\n";
            return false;
        }
        return true;
    }
}
