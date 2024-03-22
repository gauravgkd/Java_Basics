package com.basic.study;

public class FloatWrapper {
	public static void main(String[] args) {
		// Boxing : Converting Primitive Data Type into Object
		
		float f = 4.5f;
		
		Float a = Float.valueOf(f);
		
		System.out.println("The Value of Declared Variable f is : "+f);  // Initialized Value of Float Type
		
		System.out.println("The Value of Object After Boxing : "+a);  // Converted Value of Float Type into Object
		
		float b = a.floatValue();
		
		System.out.println("The Value Again Converted to Float Data Type : "+b); // Unboxing
		
		
	}
}
