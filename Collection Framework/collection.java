package com.tka;

import java.util.ArrayList;

public class collection {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(55);
		list.add(333);
		list.add(3456);
		list.add(2345);
		list.add(6789);
		list.add(7890);
		System.out.println(list);
		list.set(5, 555);
	System.out.println("Adding new element" + list);
	list.remove(3);
		System.out.println("AffterRemove " + list);
	}
}
