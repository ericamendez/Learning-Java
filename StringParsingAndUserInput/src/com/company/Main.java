package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String numAsStr = "2020";
	    int num = Integer.parseInt(numAsStr) * 2;
        System.out.println(num);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your year of birth? ");
        int yearOfBirth = scanner.nextInt();
        int age = 2020 - yearOfBirth;

        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hey " + name + ", you are " + age + " years old and are " + (age >= 21 ? "of" : "not of") + " legal drinking age.");
        scanner.close();
    }
}
