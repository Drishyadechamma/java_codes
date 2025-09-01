package com.training.day1;

public class Ascii {

    public static void main(String[] args) {
        String b = "banglore";
        System.out.println("Original: " + b);

        char x[] = b.toCharArray();
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                // convert lowercase to uppercase using ASCII
                System.out.print((char)(x[i] - 32));
            } else {
                System.out.print(x[i]);
            }
        }
    }
}
 /*for(int i='A';i<='Z';i++)
{
	System.out.println(i+"ASCII"+(char)i);
}
System.out.println("Lower case ASCII values");
for(int i=a;i<=z;i++)
{
	System.out.println(i="ASCII"+(char)i);

}
}*/ // converting to lower case 

