package com.basic.study;

public class DoubleWrapper {
	public static void main(String[] args) {
		double d = 7;
		
		Double k = Double.valueOf(d);   // Boxing
		
		double f = k.doubleValue();     // Unboxing
		
		System.out.println("The Value Initialized  : "+d);
		
		System.out.println("After Boxing : "+k);
		
		System.out.println("After Unboxing : "+f);
		
		return;
	}
}
