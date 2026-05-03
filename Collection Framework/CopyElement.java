package com.tka;

import java.util.ArrayList;
import java.util.LinkedList;

public class CopyElement {
	public static void main(String[] args) {
		LinkedList<Integer> List = new LinkedList<>();
		List.add(123);
		List.add(334);
		List.add(4567);
		List.add(78903);
		List.add(12345678);
		List.add(3456789);
		List.add(567);
		System.out.println(List);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(456);
		list1.add(4567);
		list1.add(57899);
		list1.add(234567);
		list1.add(4567);
		list1.addAll(List);
		for (Integer r : list1) {
			System.out.println(r);
		}
	}
}
