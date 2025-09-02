package com.training.day2;

public class Q1 {

	public static void main(String[] args) {
		Runnable task = ()->{
			System.out.println("Lambda thread:"+Thread.currentThread().getName());
		};
		Thread t1=new Thread(task);
		t1.start();

	}
}
