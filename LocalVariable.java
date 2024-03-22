package com.basic.study;

public class LocalVariable {
	
	public void method() {
		int a = 10;
		System.out.println("The Local Variable : "+a);
	}
	public static void main(String[] args) {
		
		LocalVariable  lv = new LocalVariable();
		lv.method();  // Does not get Called 
		
//		System.out.println(a);   // Cannot Access Here Local Variable
	}

}
