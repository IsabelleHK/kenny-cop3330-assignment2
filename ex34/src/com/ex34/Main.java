/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Isabelle Kenny
 */

package com.ex34;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> employeeNames = new ArrayList();
        employeeNames.add("John Smith");
        employeeNames.add("Jackie Jackson");
        employeeNames.add("Chris Jones");
        employeeNames.add("Amanda Cullen");
        employeeNames.add("Jeremy Goodwin");

        int size = employeeNames.size();
        System.out.println("There are " + size + " employees: ");
        System.out.println(employeeNames);

        System.out.print("\nEnter an employee name to remove: ");
        String delete = input.nextLine();
        employeeNames.remove(delete);
        int newSize = employeeNames.size();
        System.out.println("\nThere are " + newSize + " employees: ");
        System.out.println(employeeNames);


    }
}
