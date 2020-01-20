package com.company;

import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

//    constructor must match name of the class
    public BankAccount(int accountNumber, float balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void userChoice(int choice){
        Scanner scanner = new Scanner(System.in);
        switch(choice) {
            case 1:
                System.out.println("How much would you like to withdraw?");
                int amountWithdraw = scanner.nextInt();
                withdraw(amountWithdraw);
                scanner.nextLine();
                break;
            case 2:
                System.out.println("How much would you like to deposit?");
                int amountDeposit = scanner.nextInt();
                deposit(amountDeposit);
                scanner.nextLine();
                break;
            case 3:
                System.out.println("Thank you for coming by. Goodbye " + this.getCustomerName());
                break;
            default:
                System.out.println("Invalid Entry, Goodbye");
        }
    }

    public float deposit(int depositAmount) {
        float newBalance = this.balance += depositAmount;
        System.out.println("A deposit of $" + depositAmount + " has been made. New Balance is $" + newBalance);
        return newBalance;
    }

    public float withdraw(int withdrawalAmount) {
        float newFunds = this.balance -= withdrawalAmount;
        if (newFunds < 0) {
            System.out.println("Insufficient Funds. Your current balance: $" + this.balance);
            return -1.0f;
        }
        System.out.println("A withdrawal of $" + withdrawalAmount + " has been made. New Balance is $" + newFunds);
        return this.balance - withdrawalAmount;
    }

//    Easy way to set & get is through Code->Generate->Setters&Getters then select all that apply
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public float getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return  this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
