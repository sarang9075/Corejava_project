package SetRefCode;

import java.util.HashSet;

public class Merge2Set {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		HashSet set2 = new HashSet();

		set.add(123);
		set.add(345);
		set.add(567);
		set.add(789);

		set2.add(444);
		set2.add(222);
		set2.add(555);
		set2.add(666);

		set2.addAll(set);
		System.out.println(set2);
	}
}
