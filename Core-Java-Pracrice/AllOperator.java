package com.tka;

public class AllOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Arithmetic operator");
		System.out.println("Addition =" + (a + b));
		System.out.println("Substraction" + (a - b));
		System.out.println("Multiplication" + (a * b));
		System.out.println("Division" + (a / b));
		System.out.println("Moduls" + (a % b));

		// ===== Relational Operators =====
		System.out.println("\nRelational Operators");
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		System.out.println("a > b : " + (a > b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));

		// ===== Logical Operators =====
		System.out.println("\nLogical Operators");
		System.out.println("(a>b && b>5) : " + (a > b && b > 5));
		System.out.println("(a<b || b>5) : " + (a < b || b > 5));
		System.out.println("!(a>b) : " + !(a > b));

		// ===== Assignment Operators =====
		System.out.println("\nAssignment Operators");

		int x = 10;

		x += 5;
		System.out.println("x += 5 : " + x);

		x -= 2;
		System.out.println("x -= 2 : " + x);

		x *= 3;
		System.out.println("x *= 3 : " + x);

		x /= 2;
		System.out.println("x /= 2 : " + x);

		x %= 4;
		System.out.println("x %= 4 : " + x);

		// ===== Unary Operators =====
		System.out.println("\nUnary Operators");

		int y = 5;

		System.out.println("Original : " + y);
		System.out.println("++y : " + (++y));
		System.out.println("y++ : " + (y++));
		System.out.println("After y++ : " + y);
		System.out.println("--y : " + (--y));
		System.out.println("y-- : " + (y--));
		System.out.println("After y-- : " + y);

		// ===== Ternary Operator =====
		System.out.println("\nTernary Operator");

		String result = (a > b) ? "a is Greater" : "b is Greater";

		System.out.println(result);

	}
}
