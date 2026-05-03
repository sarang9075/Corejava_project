package com.tka;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String[] args) {
		ArrayList<Integer> color = new ArrayList<>();
		color.add(1000);
		color.add(2000);
		color.add(3000);
		color.add(4000);
		System.out.println("Before sorting" + color);
		Collections.sort(color);
		for (int s : color) {
			System.out.println(s);
		}
	}
}
