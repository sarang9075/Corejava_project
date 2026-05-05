package SetRefCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>();
//		set.add(124);
//		set.add(666);
//		set.add(666);
//		set.add(7890);
//		set.add(432);
//		set.add(null);
//		set.add(null);
//		System.out.println(set);
//		for (Integer i : set) {
//			System.out.println(i);
//		}
//		TreeSet<Integer> set = new TreeSet<Integer>();
//          set.add(435);
//          set.add(123);
//          set.add(4356);
//          set.add(48905);
//          set.add(345);
//          set.add(345);
//         set.add(null);   null can not accepted in treeSet becous it provide sorting
//          System.out.println(set);
//          
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(123);
		set.add(234);
		set.add(456);
		set.add(567);
		set.add(4567);
		set.add(4567);
		set.add(null);
		
		System.out.println(set);
	}
}
