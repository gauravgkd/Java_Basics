//Create a program that generates and prints the Fibonacci series up to a certain number of terms.
package com.basic.study;
import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of Terms for Fibonacci Series : ");
		int terms = sc.nextInt();
		
		int first = 0;
		int second = 1;
		
		for (int i = 0; i < terms; i++) {
			System.out.println(first+" ");
			
			int next = first + second;
			
			first = second;
			second = next;
		}
	}
}
