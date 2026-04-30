package com.jbk;

public class Reverse {
	public static void main(String[] args) {
		int[] arr = { 6, 5, 4, 3, 2, 1 };
		System.out.println("Reverse array");
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.println("Reverse Array " + arr[i]);
		}
	}

}
