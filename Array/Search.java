package com.jbk;

public class Search {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50 };
		int search = 40;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == search) {
				System.out.println("Element found" + i);
			} else {
				System.out.println("Element Not found" + i);
			}
		}
	}
}
