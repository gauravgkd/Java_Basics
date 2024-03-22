// Implement a program that calculates the factorial of a given number.
package com.basic.study;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter a Number to get it's Factorial : ");
		int a = obj.nextInt();
		
		double factorial = 1;
		
		for (int i = 1; i <= a; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("The Factorial of the Number "+a+" is "+factorial);
	}
}
