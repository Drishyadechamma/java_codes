package com.training.day2;

public class StudentStore {
	
	    private Student[] students; // array to hold student objects
	    private int count;          // how many students are stored

	    // Constructor to fix size
	    public StudentStore(int size) {
	        students = new Student[size];
	        count = 0;
	    }

	    // Method to add student
	    public void addStudent(Student s) {
	        if (count < students.length) {
	            students[count] = s;
	            count++;
	        } else {
	            System.out.println("Store is full! Cannot add more students.");
	        }
	    }

	    // Method to display all students
	    public void displayStudents() {
	        for (int i = 0; i < count; i++) {
	            System.out.println(students[i]);
	        }
	    }
	}


