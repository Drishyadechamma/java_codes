package com.training.day2;

class Wifichecking extends Thread{
	public void run()
	{
		task();
	}
	void task () {
		for(int i=0;i<27;i++) {
			try {
				Thread.sleep(3000);
				System.out.println("wifi connecting ..");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class charging extends Thread{
	public void run()
	{
		task();
	}
	void task() {
		for(int i=0;i<50;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("charging started ..");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Bluetooth extends Thread {
	public void run()
	{
		task();
	}
	void task() {
		for(int i=0;i<30;i++) {
			try {
				Thread.sleep(1000);
				System.err.println("bluetooth connecting...");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Race {
	public static void main(String[] args) {
		//wifi checking 
		//charging 
		Wifichecking w=new Wifichecking();
		w.start();
		charging c=new charging();
		c.start();
		Bluetooth b=new Bluetooth();
		b.start();
		
	}

}
