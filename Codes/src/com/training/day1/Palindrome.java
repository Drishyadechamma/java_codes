package com.training.day1;

public class Palindrome {
	
		public static void main(String[] args) {
		             String str = "madam";  // 

			        String reversed = "";
			        for (int i = str.length()- 1; i>= 0; i--) {
			            reversed = reversed + str.charAt(i);
			        }

			        if (str.equalsIgnoreCase(reversed)) {
			            System.out.println("Palindrome");
			        } else {
			            System.out.println("Not a palindrome");
			        }
			    }
	        }


		





