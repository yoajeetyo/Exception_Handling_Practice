package com.bl.exception;

public class AgeCheckCustomExceptionUsingThrow {

	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Access granted - You are old enough!");
		}
	}

	public static void main(String[] args) {
		checkAge(18); // Set age below 18...
	}
}
