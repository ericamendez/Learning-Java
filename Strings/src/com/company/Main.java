package com.company;

public class Main {

    public static void main(String[] args) {
	String myString = "double quotes for strings";
        System.out.println("myString is: " + myString + " , the end");

        String numStr = "50";
        int myInt = 10;
        String lastString = numStr + myInt;
        System.out.println("if left is string, it will treat right as string, and just concat: " + lastString);
    }
}
