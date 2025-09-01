package com.training.day1;

public class AlternateString {

    public static void main(String[] args) {
        String str = "drishya";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(str.charAt(i)));
            } else {
                result.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Modified: " + result.toString());
    }
}
