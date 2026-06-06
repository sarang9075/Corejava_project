package com.tka;

public class Table {

	public static void Multiplication(int no) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(no + "*" + i + "=" + (no * i));

		}
	}

	public static void main(String[] args) {
		Multiplication(10);
	}
}