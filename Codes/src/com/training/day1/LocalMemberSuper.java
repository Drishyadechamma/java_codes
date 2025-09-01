package com.training.day1;


		// Parent class
		class Parent {
		    int num = 100; // Member variable (instance variable in parent)
		}

		// Child class
		class Child extends Parent {
		    int num = 200; // Member variable (instance variable in child)

		    void showNumbers() {
		        int num = 300; // Local variable

		        System.out.println("Local variable: " + num);          // Refers to local
		        System.out.println("Member variable: " + this.num);    // Refers to child's member variable
		        System.out.println("Super variable: " + super.num);    // Refers to parent's member variable
		    }
		}

		// Main class
		public class LocalMemberSuper{
		    public static void main(String[] args) {
		        Child obj = new Child();
		        obj.showNumbers();
		    }
		}

	


