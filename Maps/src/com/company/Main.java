package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("[Hashmap]");
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("Brave", "1");
        dictionary.put("Joy", "2");
        dictionary.put("Brilliant", "3");
        dictionary.put("Confidence", "4");

        for(String word: dictionary.keySet()) {
            System.out.println(word + " : " + dictionary.get(word));
        }
        System.out.println(dictionary.entrySet());

        System.out.println("\n[LinkedHashmap] proccesses key in order (preserves order of insertion)");
        LinkedHashMap<String, String> dictionaryTwo = new LinkedHashMap<String, String>();
        dictionaryTwo.put("Brave", "1");
        dictionaryTwo.put("Joy", "2");
        dictionaryTwo.put("Brilliant", "3");
        dictionaryTwo.put("Confidence", "4");

        for(String word: dictionaryTwo.keySet()) {
            System.out.println(word + " : " + dictionaryTwo.get(word));
        }
        System.out.println(dictionaryTwo.entrySet() + "\n");

        System.out.println("[Looping through a map]");
        for (Map.Entry<String, String> entry: dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("\nTree map maintains natural order (for letters it's alphabetic, number 0-10 etc)");
        TreeMap<String, String> dictionaryThree = new TreeMap<String, String>();
        dictionaryThree.put("Brave", "1");
        dictionaryThree.put("Joy", "2");
        dictionaryThree.put("Apple", "3");
        dictionaryThree.put("Confidence", "4");

        for (Map.Entry<String, String> entry: dictionaryThree.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
