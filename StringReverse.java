//Write a program that takes a string as input and prints its reverse.
package com.basic.study;
import java.util.*;

public class StringReverse {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter a String : ");
		String a = obj.nextLine();
		
		String b = "";
		
		for (int i = a.length()-1; i >= 0; i--) {
			b = b+a.charAt(i);
		}
		
		System.out.print("The Reversed String is : "+b);
	}

}
