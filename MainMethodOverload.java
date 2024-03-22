package com.basic.study;

public class MainMethodOverload {
	public static void main(String[] args) {
		System.out.println("The Standard Main Method");
	}
	
	public static void main(String args) {
		
		System.out.println("Overloaded Main Method");
	}
	
	public static void main(String args, int age) {
		System.out.println("The Main Method Overloaded With Two Args");
	}
}


// When Running the Program only the Standard Main Method 
// Will Get Executed 