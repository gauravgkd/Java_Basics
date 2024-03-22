// Create a program that takes two numbers as input and prints their sum.
package com.basic.study;
import java.util.*;

public class Sum {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = sc.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("Sum of First & Second Number is : "+sum);
	}
}
