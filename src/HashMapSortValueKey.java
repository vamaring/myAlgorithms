package myJavaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortValueKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("mom", 3);
		hm.put("dad", 4);
		hm.put("101", 1);
		hm.put("a", 1);
		hm.put("e", 1);
		hm.put("peep", 1);
		
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(hm.entrySet());
		Collections.sort(entryList, 
				new Comparator<Map.Entry<String, Integer>>(){

					@Override
					public int compare(Entry<String, Integer> entry1, Entry<String, Integer> entry2) {
						// TODO Auto-generated method stub
						int ret = entry2.getValue().compareTo(entry1.getValue());
						if (ret == 0) {
							ret = entry1.getKey().compareTo(entry2.getKey());
						}
						return ret;
						
					}
			
		});
		
		System.out.println(hm);
		String num = "101";
		System.out.println(num.toLowerCase());
	}

}
