package com.training.day2;

public class BouncingBall {
	
	    public static void main(String[] args) throws InterruptedException {
	        int width = 30; // console width
	        int pos = 0;    // starting position
	        int dir = 1;    // 1 = right, -1 = left

	        while (true) {
	            // Clear screen (works in Eclipse console)
	            System.out.print("\033[H\033[2J");  
	            System.out.flush();

	            // Print spaces before ball
	            for (int i = 0; i < pos; i++) {
	                System.out.print(" ");
	            }
	            System.out.println("⚽"); // ball emoji

	            // Move ball
	            pos += dir;

	            // Bounce back at edges
	            if (pos == 0 || pos == width) {
	                dir *= -1;
	            }

	            // Slow down movement
	            Thread.sleep(100);
	        }
	    }
	}



