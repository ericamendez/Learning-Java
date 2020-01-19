package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(2, 10));
        System.out.println(calcFeetAndInchesToCentimeters(34));
    }

//  Method overloading lets us use a method with the same name, as long as they have different parameters
//  ability to call method of same name with different implementations
//  improves code readibility and use-ability
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet >= 0 || inches >=0 && inches <= 12) {
            int allInches = feet * 12 + inches;
            return allInches * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches >=0) {
            int feet = inches / 12;
            int remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score, int level) {
        System.out.println( playerName + " scored " + score + " points in level " + level);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, No Score");
        return 0;
    }
}
