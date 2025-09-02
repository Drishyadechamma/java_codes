package com.training.day2;

//import java.util.ArrayList;
import java.util.*;


// example for ArrayList  
public class MyArrayListExample {
    public static void main(String[] args) {
    	
       // ArrayList<Integer> a = new ArrayList<>();  
    	Vector v =new Vector();
    	v.ensureCapacity(10);//important for MNC project 
        v.add(10);
        v.add(35);
        v.add(20);
        v.add(33);
        v.add(45);
        v.add(55);

        System.out.println(v.toString()); 
        //with example iterator:its having cursor 
        Iterator it =v.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        ArrayList a1=new ArrayList();
        a1.addAll(v);
        System.out.println("array list" +" "+ a1.size());
        System.out.println("elements in arrlist");
        System.out.println(a1.toString());
    }
}
