package SetRefCode;

import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Sarang");
		set.add("Sohan");
		set.add("Chandu");
		set.add("Rahul");
		set.add("Shivam");
		set.add("Suraj");

		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
