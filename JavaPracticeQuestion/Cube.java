package com.tka;

public class Cube {
	public static int getNumberCube(int num) {
		return num * num * num;

	}

	public static void main(String[] args) {
		int result = getNumberCube(10);
		System.out.println("Cube =" + result);
	}
}
