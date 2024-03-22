//Write a program that finds and prints the maximum of three numbers.
package com.basic.study;
import java.util.*;

public class MaxOfThree {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter First Number : ");
		int a = obj.nextInt();
		
		System.out.print("Enter Second Number : ");
		int b = obj.nextInt();
		
		System.out.print("Enter Third Number : ");
		int c = obj.nextInt();
		
		if (a > b && a > c) {
			System.out.println("The First Number is MAX among three Numbers that is : "+a);
		}
		else if (b > a && b > c) {
			System.out.println("The Second Number is MAX among three Numbers that is : "+b);
		}
		else {
			System.out.println("\nThe Third Number is MAX among three Numbers that is : "+c);
		}
	}
}
