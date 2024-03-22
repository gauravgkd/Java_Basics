package com.basic.study;

public class LongWrapperExample {
	public static void main(String[] args) {
        // Creating a Long object using autoboxing
        Long longObj = 9223372036854775807L; // Note: The 'L' suffix denotes a long literal

        // Unboxing: Converting Long to long
        long primitiveLong = longObj.longValue();

        // Printing results
        System.out.println("Original long: " + primitiveLong);
        System.out.println("Wrapped Long: " + longObj);
    }
}
