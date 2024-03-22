// Program to check if a given number is a Palindrome 
package com.basic.study;
import java.util.*;
public class PalindromeNumber {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number  : ");
		int num = sc.nextInt();
		
		int oNum = num;
		
		int revNum = 0;
		
		while (num > 0) {
			int digit = num%10;
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		
		if (oNum == revNum) {
			System.out.println("The Given Number is Palindrome.");
		}
		else {
			System.out.println("The Given Number is Not a Palindrome Number.");
		}
	}
}


// Iteration 
//num = 313
//digit = 313%10 = 3
//revNum = 0 * 10 + 3 = 3
//num = 313/10 = 31
//num = 31
//digit = 31%10 = 1
//revNum = 3 * 10 + 1 = 31
//num = 31/10 = 3
//num = 3
//digit = 3%10 = 3
//revNum = 31 * 10 + 3 = 313
//num = 3/10 = 0


