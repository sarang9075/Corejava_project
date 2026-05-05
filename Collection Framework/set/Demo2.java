package SetRefCode;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		list.add(234);
//		list.add("Sarang");
//		list.add(true);
//		list.add(23456778887654444l);
//		list.add(23.45f);
//		ListIterator itr = list.listIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//
//		Iterator itr = list.iterator();
//	while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//  Vector list2 = new Vector ();
//  list2.add(234);
//  list2.add("Sarang");
//  list2.add(true);
//  list2.add(45.33f);
//  list2.add(34556789053234l);
//  list2.add(43567);
//  
//  Enumeration EEE = list2.elements();
//  while (EEE.hasMoreElements()) {
//	  System.out.println(EEE.nextElement());
//	  
//  }
		HashSet list2 = new HashSet();
		list2.add(2345);
		list2.add("Sarang");
		list2.add(true);
		list2.add(78.899f);
		list2.add(123456789009877l);
		list2.add(4345);
		list2.add(5678);

		Iterator itr = list2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
