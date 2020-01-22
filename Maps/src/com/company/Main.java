package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("[Hashmap]");
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "ready to face and endure danger or pain");
        dictionary.put("Joy", "something");
        dictionary.put("Brilliant", "test");
        dictionary.put("Confidence", "another");

        for(String word: dictionary.keySet()) {
            System.out.println(word);
        }

        System.out.println("\n");
        System.out.println("[LinkedHashmap] proccesses key in order");
        LinkedHashMap<String, String> dictionaryTwo = new LinkedHashMap<String, String>();
        dictionaryTwo.put("Brave", "ready to face and endure danger or pain");
        dictionaryTwo.put("Joy", "something");
        dictionaryTwo.put("Brilliant", "test");
        dictionaryTwo.put("Confidence", "another");

        for(String word: dictionaryTwo.keySet()) {
            System.out.println(word);
        }
    }
}
