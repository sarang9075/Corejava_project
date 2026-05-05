package SetRefCode;

import java.util.LinkedHashSet;

public class FirstandLast {
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(1234);
		set.add("Sarang");
		set.add(null);
		set.add(1234567889997765l);
		set.add(12.455f);
		set.add(123434);
		System.out.println("The First Element is"+set.getFirst());
		System.out.println("The Last Element is"+set.getLast());

	}

}
