package com.training.day1;

public class OddEvenArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 13, 14, 15, 16};

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // move to next line

        System.out.print("Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}
