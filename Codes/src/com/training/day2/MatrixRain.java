package com.training.day2;
import java.util.Random;
public class MatrixRain {
	public static void main(String[] args) throws InterruptedException {
	        Random rand = new Random();
	        int width = 100; // console width
	        int height = 30; // console height

	        // Infinite loop for effect
	        while (true) {
	            StringBuilder line = new StringBuilder();

	            for (int i = 0; i < width; i++) {
	                if (rand.nextInt(5) == 0) {
	                    // print random character
	                    char c = (char) (rand.nextInt(94) + 33);
	                    line.append(c);
	                } else {
	                    line.append(" ");
	                }
	            }

	            System.out.println(line);
	            Thread.sleep(100); // delay for animation effect
	        }
	    }
	}



