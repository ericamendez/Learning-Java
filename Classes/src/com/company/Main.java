package com.company;

public class Main {

    public static void main(String[] args) {
	// Objects store state in fields (variables), and behaviour in methods
    // class is a template or blueprint for creating object
        Car tesla = new Car();
        Car porsche = new Car();

        porsche.setModel("something");
        System.out.println("Model is " + porsche.getModel());
    }
}
