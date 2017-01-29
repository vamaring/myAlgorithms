package myJavaLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class duplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 8, 7, 3, 7, 2, 3, 8, 7, 9, 8 };
		System.out.println("Duplicate elements in array : ");
        printList(findDuplicates(arr));
        
	}

	private static void printList(List<Integer> list) {
		// TODO Auto-generated method stub
		
		for (int i=0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}

	private static List<Integer> findDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> hm = generateNumberMap(arr);
		List<Integer> list = new ArrayList<Integer>();
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> me = (Entry<Integer, Integer>) itr.next();
			
			if (me.getValue() > 1)
				list.add(me.getKey());
		}
		
		
		return list;
	}
	
	private static Map<Integer, Integer> generateNumberMap(int arr[]) {
		Map<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for (int i=0; i < arr.length; i++) {
			if (!hmap.containsKey(arr[i]))
				hmap.put(arr[i], 1);
			else
				hmap.put(arr[i], hmap.get(arr[i]) + 1);
		}
		
		return hmap;
	}
	

}
