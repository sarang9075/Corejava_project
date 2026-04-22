package com.tka;

public class Demo {
	public static void main(String[] args) {
//		System.out.println(4 / 2);
//		System.out.println(4 / 1);
//		System.out.println(6 / 3);
//		System.out.println(12 / 2);
//
//		try {
//			System.out.println(2 / 0);
//		} catch (ArithmeticException e) {
//			System.out.println("/ by zero not possible in java");
//
//		}
//		System.out.println(10 / 5);
//		System.out.println(8 / 4);

//		  try { Class.forName(""); 
//		  }catch (ClassNotFoundException e) {
//		  System.out.println("this is exaple of compile time exception"); }
//		 
		try {
			System.out.println(3 / 0);
		} catch (Exception e) {
			System.out.println("this is not allowed");
		} finally {
			System.out.println("this is example of finally block");
		}
	}
}
