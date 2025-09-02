package com.training.day2;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap object (key = Integer, value = String)
        TreeMap<Integer, String> v = new TreeMap<>();

        // Add key-value pairs
        v.put(12, "mahesh");
        v.put(13, "drishya");
        v.put(14, "madhu");
        v.put(15, "ananya");
        v.put(16, "diya");
        v.put(17, "liya");

        // Print TreeMap
        System.out.println(v);
    }
}
