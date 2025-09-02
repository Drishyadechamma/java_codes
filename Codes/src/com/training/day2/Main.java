package com.training.day2;

public class Main {

	public static void main(String[] args) {
		
		        // Create store with capacity 5
		        StudentStore store = new StudentStore(5);

		        // Add Student objects
		        store.addStudent(new Student(1, "Drishya"));
		        store.addStudent(new Student(2, "Mahesh"));
		        store.addStudent(new Student(3, "Ananya"));

		        // Display all students
		        store.displayStudents();
		    }
		}

		

	


