package com.training.day2;


	public class Student {
	    private int id;
	    private String name;

	    // Constructor
	    public Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Getters and Setters (Java Bean style)
	    public int getId() {
	        return id;
	    }
	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    // To display nicely
	    @Override
	    public String toString() {
	        return "Student{id=" + id + ", name='" + name + "'}";
	    }
	}



