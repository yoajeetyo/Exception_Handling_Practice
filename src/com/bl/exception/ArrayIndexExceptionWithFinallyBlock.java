package com.bl.exception;

public class ArrayIndexExceptionWithFinallyBlock {
	
	public static void main(String[] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[10]);
	    } catch (Exception e) {
	      System.out.println("Please provide right index.");
	    } finally {
	      System.out.println("The 'try catch' is finished. Finally block executed here.");
	    }
	  }
}
