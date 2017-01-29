package myJavaLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class duplicateWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 duplicateWords("Bread butter and bread");
		 
	        duplicateWords("Java is java again java");
	 
	        duplicateWords("Super Man Bat Man Spider Man");
	        
	       Scanner sc = new Scanner(System.in);
	       String str = sc.nextLine();
	       int count = str.trim().split("\\s+").length;
	       System.out.println(count);
	       
	}

	private static void duplicateWords(String string) {
		// TODO Auto-generated method stub
		
		String[] arr = string.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (int i=0; i < arr.length; i++) {
			
			if (!hm.containsKey(arr[i].toLowerCase())) {
				hm.put(arr[i].toLowerCase(), 1);
			} else {
				hm.put(arr[i].toLowerCase(), hm.get(arr[i].toLowerCase()) + 1);
			}
			
		}
		
		System.out.println(hm.toString());
		
		Set set = hm.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = (Entry<String, Integer>) itr.next();
			
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "--" + entry.getValue());
			}
		}
		
		
		
	}

}
