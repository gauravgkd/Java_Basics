package com.basic.study;

import java.util.Scanner;

public class Prime {
	boolean isPrime(int num) {
		if (num <= 1) return false;
		for (int i = 2; i*i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int num = scan.nextInt();
		
		
		Prime prime = new Prime();
		
		if (prime.isPrime(num)) {
			System.out.println("Prime Number !!");
		}
		else {
			System.out.println("Not a Prime Number !!");
		}
		
	}
}
