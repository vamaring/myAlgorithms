package myJavaLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class sortArrayByFrequency {


	private static void sortByFrequency(int[] arr) {
		Map<Integer, Integer> frequencyMap = createFrequencyMap(arr);

		List<Entry<Integer, Integer>> entryList = sortByValue(frequencyMap);

		putSortedElementsBackInArray(arr, entryList);
	}
	
	public static Map<Integer,Integer> createFrequencyMap(int[] myarr) {
		Map<Integer,Integer> lMap = new LinkedHashMap<Integer,Integer>();
		
		
		for (int i=0; i < myarr.length; i++) {
			
			if (!lMap.containsKey(myarr[i])) {			
				lMap.put(myarr[i], 1);
			} else {
				lMap.put(myarr[i], lMap.get(myarr[i]) + 1);
			}
			
		}
		return lMap;
		
	}
	
	
	public static List<Entry<Integer, Integer>> sortByValue(Map<Integer,Integer> map) {
		
		List<Entry<Integer, Integer>> entryList = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		
		Collections.sort(entryList,
				new Comparator<Map.Entry<Integer, Integer>>() {
				
					@Override
					public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
						// TODO Auto-generated method stub
						return o2.getValue().compareTo(o1.getValue());
					}});
		
		
		return entryList;
		
	}
	
	
	public static void putSortedElementsBackInArray(int arr[], List<Entry<Integer, Integer>> list) {
		
		int index=0;
		for (Map.Entry<Integer, Integer> entry: list) {
			
			for (int i=0; i<entry.getValue(); i++) {
				arr[index++] = entry.getKey();
			}
		}
		
	}
	
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int arr[]= {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
		//  output should be {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}.

		System.out.println("Input array before sorting elements by frequency.");
		printArray(arr);

		sortByFrequency(arr);

		System.out.println();
		System.out.println();

		System.out.println("Array after sorting elements by frequency.");
		printArray(arr);
		
		
	}
}

