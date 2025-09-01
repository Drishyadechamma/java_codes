package com.training.day1;
import java.util.Arrays;
public class MoveZeroes {

	public static void main(String[] args) {
				        int[] arr = {10, 0, 100, 0, 5, 0, 4, 3, 2, 1, 0};

		        int index = 0; // position to place non-zero numbers

		        // Step 1: Move all non-zero elements to the front
		        for (int num : arr) {
		            if (num != 0) {
		                arr[index] = num;
		                index++;
		            }
		        }

		        // Step 2: Fill remaining positions with 0
		        while (index < arr.length) {
		            arr[index] = 0;
		            index++;
		        }

		        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
		    }
		}

	



