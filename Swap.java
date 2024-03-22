//Create a program that swaps the values of two variables.
package com.basic.study;
import java.util.*;

public class Swap {
	public static void main(String[] args) {
		
		@SuppressWarnings({ "unused", "resource" })
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter first Number to Swap with Second Number : ");
		
		double a = obj.nextDouble();
		
		System.out.print("Enter second Number to Swap with the First Number : ");
		double b = obj.nextDouble();
		
		double temp = a;
		a = b;
		b = temp;
		
		System.out.println("The first Number After Swapping : "+a);
		System.out.print("The Second Number After Swapping : "+b);
	}

}
