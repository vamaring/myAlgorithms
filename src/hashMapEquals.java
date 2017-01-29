package myJavaLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashMapEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("a", new Integer(1));
		map1.put("b", new Integer(2));
		
		
		Set<?> set1 = map1.entrySet();
		Iterator<?> itr = set1.iterator();
		
		while (itr.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) itr.next();
			System.out.println(entry.getKey() + "-- " + entry.getValue());
		}
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		map2.put("a", 1);
		map2.put("b", 2);
		
	
		
		if(map1.equals(map2)) {
			System.out.println("Both maps have same keys and values");
		} else {
			System.out.println("Both maps are different");

		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		boolean canAdd = set.add(new Integer(2));
		System.out.println(canAdd);
		
		List<Integer> li = new ArrayList<>();
		
		li.add(1);
		li.add(2);
		
	
		
		
		
	}

}
