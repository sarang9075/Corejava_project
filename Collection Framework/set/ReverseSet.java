package SetRefCode;

import java.util.LinkedHashSet;

public class ReverseSet {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println("0rignal " + set);
		System.out.println("Reverse" + set.reversed());

	}
}
