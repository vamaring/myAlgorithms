package myJavaLearning;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7, 2, 5, 11};
		int target = 9;
		
		HashMap<Integer,Integer> hm = new HashMap<Integer, Integer>();
		hm.re
		
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (hm.containsKey(complement)){
				System.out.println("Two indices whose sum = target are: " +hm.get(complement) +" and " +i);
			} else {
				hm.put(arr[i], i);
			}
		}
		
	}

}
