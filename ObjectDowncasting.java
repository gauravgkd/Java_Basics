package com.basic.study;

class Vehicle {
    // ...
}

class Bike extends Vehicle {
    // ...
}
public class ObjectDowncasting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
        
		Vehicle vehicle = new Bike();
        
		Bike bike = (Bike) vehicle;
    }
	
}
