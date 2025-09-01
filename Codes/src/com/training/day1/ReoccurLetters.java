package com.training.day1;

public class ReoccurLetters {
	
	    public static void main(String[] args) {
	        String s = "Programming"; 
	        System.out.println("s: " + s);
	        System.out.print("Repeating letters: ");

	     
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);

	            
	            for (int j = i + 1; j < s.length(); j++) {
	                if (ch == s.charAt(j)) {
	                    System.out.print(ch + " ");
	                    break;
	                }
	            }
	        }
	    }
	}



