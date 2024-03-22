//Write a program that calculates and prints the average of three numbers.
package com.basic.study;
import java.util.*;

public class Average {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		double a = sc.nextDouble();
		
		System.out.print("Enter Second Number : ");
		double b = sc.nextDouble();
		
		System.out.print("Enter Third Number : ");
		double c = sc.nextDouble();
		
		double avg = (a + b + c)/3;
		System.out.println("The Average of the Three Numbers is : "+avg);
	}
}
