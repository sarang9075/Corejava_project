package SetRefCode;

import java.util.HashSet;

public class ElementExistOrNot {
public static void main(String[] args) {
	HashSet  set = new HashSet();
	set.add(123);
	set.add("Sarang");
	set.add(3456);
	set.add(34.44f);
	set.add(true);
	System.out.println(set.contains(123));
}
}
