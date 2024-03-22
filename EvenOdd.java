// Develop a program that checks if a given number is even or odd.
package com.basic.study;
import java.util.*;

public class EvenOdd {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a Number ");
		double num = obj.nextDouble();
		
		if (num % 2 == 0 ) {
			System.out.println("The Given Number is Even.");
		}
		else {
			System.out.println("The Given Number is Odd. ");
		}
	}

}
