package com.training.day1;
import java.util.TreeSet;
class Demo
{
	void m1() {
		try {
			TreeSet t=new TreeSet();
			t.add(14);
			t.add(45);
			t.add(96);
			t.add("madhu");
			t.add(420);
			t.add(93);
			t.add(24);
			System.out.println(t);
			int a1[]= {1,2,34};
			System.out.println(a1[10]);
			String name=null;
			System.out.println(name.length());
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
	}catch(ArithmeticException s){
	 System.out.println("cant divide by zero");
		}catch(NullPointerException c) {
			System.out.println("null does not have length");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("your array size is 2 index");
		}catch(Exception e) {
			System.out.println("all type of exception handles block");
		}finally {
			System.out.println("always executes");
		}
	}
}
public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("main started");
		Demo d = new Demo();
		d.m1();
		System.out.println("main ended ");
		
	}
}
