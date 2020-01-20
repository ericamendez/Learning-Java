package com.company;
// access modifier public: unrestricted access to the class,
// private: no access to other class,
// protected: allows classes in this package to access class,
// also can remove access modifier
public class Car {
//    member variables or fields
//    private fields to adhere to encapsulation,
//    The internal representation of an object is gonna be hidden from view outside of the object's definition
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
