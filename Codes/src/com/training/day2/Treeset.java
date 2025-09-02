package com.training.day2;
import java.util.Iterator;
import java.util.TreeSet;


public class Treeset {
	public static void main(String[] args) {
		 TreeSet<Integer> numbers = new TreeSet<>();

		        numbers.add(50);
		        numbers.add(10);
		        numbers.add(30);
		        numbers.add(20);
		        numbers.add(50); 

		     System.out.println(numbers.size());
		     System.out.println(numbers.toString());
		     
		     Iterator it =numbers.iterator();
		        while(it.hasNext())
		        {
		        	System.out.println(it.next());
		        }
		    }
		}


	


