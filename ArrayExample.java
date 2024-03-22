package com.basic.study;
// Array Example using Primitive DataTYpes
public class ArrayExample {
	public static void main(String[] args) {
		int[] intArray = new int[5];
		double[] dArray = new double[5];
		char[] cArray = new char[5];
		
		for (int i = 0; i < 5; i++) {
			intArray[i] = i + 1;
			dArray[i] = i + 1.5;
			cArray[i] = (char)(i + 'A');
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+intArray[i]);
			System.out.println(i+dArray[i]);
			System.out.println(i+cArray[i]);
		}
	}
}
