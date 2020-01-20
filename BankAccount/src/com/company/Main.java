package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    BankAccount ericaBA = new BankAccount(123456789, 5000, "Erica Mendez", "ecmendez25@gmail.com", "9783907008");

		System.out.println("Welcome to your bank account " + ericaBA.getCustomerName());
		System.out.println("Balance: " + ericaBA.getBalance());
		System.out.println("Account Number: " + ericaBA.getAccountNumber());
		System.out.println("Email: " + ericaBA.getEmail());
		System.out.println("Phone Number: " + ericaBA.getPhoneNumber());

		System.out.println("Would you like to make a withdrawal or deposit?");
		System.out.println("Enter (1)Withdrawal (2)Deposit (3)Exit");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		ericaBA.userChoice(input);

		scanner.nextLine();
    }
}
