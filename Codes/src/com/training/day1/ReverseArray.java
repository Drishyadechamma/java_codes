package com.training.day1;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {1, 4, 6, 8, 10, 12, -10, -8};

		        System.out.println("Original Array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }

		        // Reverse logic
		        int start = 0, end = arr.length - 1;
		        while (start < end) {
		            int temp = arr[start];
		            arr[start] = arr[end];
		            arr[end] = temp;
		            start++;
		            end--;
		        }

		        System.out.println("\nReversed Array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		}


	


