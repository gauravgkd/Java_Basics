package com.basic.study;
class Animal{
	
	public Animal() {
		System.out.println("This is Animal Class.");	}
}

class Dog extends Animal {
	
	public Dog() {
		System.out.println("This is Dog Class.");
	}
}
public class ObjectUpcasting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Animal animal = dog;  //UpCasting	
		
		// Upcasting : When we create object of subclass and assign or cast it to the reference of Superclass.
	}
}



// Upcasting : Widening : Implicit Casting 