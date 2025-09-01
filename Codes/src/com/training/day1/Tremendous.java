package com.training.day1;
import java.util.Scanner;

public class Tremendous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       /* System.out.print("Enter a number: ");
        long num = sc.nextLong();  // use long instead of int

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + " is a Tremendous number.");
        } else {
            System.out.println(num + " is NOT a Tremendous number.");
        }

        sc.close();
    }
}*/
        try {
        	int a =sc.nextInt();
        	System.out.println(" not tremendous"+a);
        }
        catch(Exception e) {
        	System.out.println("tremendous");
        }
        }
}
