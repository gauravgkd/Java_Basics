package com.basic.study;

public class InstanceVariable{
	
	int age;
	String name;
	
	public InstanceVariable(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public void display() {
		System.out.println("The Name is : "+name);
		System.out.println("The Age is : "+age);
	}
	public static void main(String[] args) {
		InstanceVariable iVariable = new InstanceVariable(24, "Gaurav");
		
		iVariable.display();
	}
		
	
}