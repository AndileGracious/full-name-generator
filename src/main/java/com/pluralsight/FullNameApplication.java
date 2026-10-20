package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class FullNameApplication {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");

        System.out.println("First name: ");
        String firstName = scanner.nextLine().trim();


        System.out.println("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.println("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();

        System.out.println("Full name is : " + firstName + " " + middleName + " " + lastName + " " + suffix);
    }
}
