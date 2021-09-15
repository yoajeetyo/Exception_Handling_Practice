package com.bl.exception;

public class ArithmeticExceptionGetMessage {

	public static void main(String[] args) {

		try {
			int result = 100 / 0;
			System.out.println(result);
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException => " + ex.getMessage());
		}
	}

}
