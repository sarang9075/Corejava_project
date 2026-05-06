package MapRefCode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Demo {
	public static void main(String[] args) {
//		HashMap map = new HashMap();
//		map.put(123, "Sarang");
//		map.put(123, "suraj");
//		map.put(123.44, "shivam");
//		map.put(123, "sonu");
//		map.put(123, "rahul");
//
//		System.out.println(map);
//
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "Sarang");
//		map.put(2, "Rahul");
//		map.put(3, "Suraj");
//		map.put(4, "Sohan");
//		map.put(5, "Shivam");
//		map.put(null, "rohan");
//		map.put(null, null);
//		System.out.println(map);
//
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//		// Key is not accepted null value becouse it provaides sorting featuers
//
//		map.put(1, "Sarang");
//		map.put(2, null);
//		map.put(3, "Suraj");
//		map.put(4, "sohan");
//		map.put(5, "Shivam");
//		map.put(6, "rohan");
//		System.out.println(map);

	//	LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		// Key is not accepted null value becouse it provaides sorting featuers.
		
		map.put(1, "Sarang");
		map.put(2, null);
		map.put(3, "Suraj");
		map.put(4, "sohan");
		map.put(5, "Shivam");
		map.put(6, "rohan");
		System.out.println(map);

		System.out.println(map.get(4));

		for (Entry<Integer, String> data : map.entrySet()) {
			System.out.println(data.getKey() + "--->" + data.getValue());
		}
		Hashtable<Integer, String> mapp = new Hashtable<Integer, String>();
		// it is not accepted null Key & null Value
		mapp.put(0, "pune");
		mapp.put(1, "mumbai");
		mapp.put(2, "delhi");
		mapp.put(3, "nagar");
		mapp.put(4, "kolhapur");
		mapp.put(5, "nanded");
		mapp.put(6, "nagpur");
		System.out.println(mapp);

	}
}
