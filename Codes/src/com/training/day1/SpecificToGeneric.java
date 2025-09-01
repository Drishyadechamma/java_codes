package com.training.day1;

public class SpecificToGeneric {
public static void main(String[] args) {
		        try {
		            int[] arr = {1, 2, 3, 8, 9, 6};
		            int result = arr[2]/0; 
		        } 
		        catch (ArithmeticException e) {
		             System.out.println("Error: Division by zero.");
		        } 
		        catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Error: Array index out of range.");
		        } 
		        catch (Exception e) {
		            System.out.println("Some other error occurred.");
		        }
		    }
		}

	
/* public class GenericExample {
 
    public static void main(String[] args) {
        try {
            String str = null;   // null reference
            System.out.println(str.length()); // ❌ NullPointerException
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range.");
        } 
        catch (Exception e) {
            System.out.println("Some other error occurred.");
        }
    }
}  */


