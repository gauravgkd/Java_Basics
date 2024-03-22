package com.basic.study;

public class ByteWrapper {
	public static void main(String[] args) {
		byte b = 4;                   // Declaration & Initialization
		Byte h = Byte.valueOf(b);     // Boxing (Converting Value Type into Object Type)
		byte l = h.byteValue();       // Unboxing (Converting Object Type into Value Type)
		
		System.out.println(b);
		System.out.println(h);
		System.out.println(l);
	}
}
