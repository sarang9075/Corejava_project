package SetRefCode;

import java.util.Iterator;
import java.util.TreeSet;

public class Sort {
public static void main(String[] args) {
	TreeSet<Integer> set = new TreeSet<>();
	set.add(123);
	set.add(1234);
	set.add(12345);
	set.add(123456);
	
	Iterator itr = set.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
