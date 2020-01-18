package com.company;

public class Main {
//    Float single precision, Double is double precision
    public static void main(String[] args) {
//      width of int = 32 (4 bytes)
	    int myIntValue = 5 / 3;

//	    number with a decimal point Java will assume it's a double.

//      width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3;
//	    width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3;

//	    double is faster om many modern computers, & many in built functions in Java use doubles as calculations (more precise)

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        float pounds = 200f;
        float kilogramConversion = pounds * 0.45359237f;

        System.out.println(pounds + " lbs is " + kilogramConversion + " kilograms");
    }
}
