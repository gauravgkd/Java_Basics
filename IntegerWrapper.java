package com.basic.study;

public class IntegerWrapper {
	public static void main(String[] args) {
        // Boxing: Converting int to Integer
        int primitiveInt = 42;
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        // Unboxing: Converting Integer to int
        int unwrappedInt = wrappedInt.intValue();

        System.out.println("Original int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped int: " + unwrappedInt);
    }

}
