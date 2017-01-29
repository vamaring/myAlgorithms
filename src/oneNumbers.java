package myJavaLearning;

import java.util.Arrays;
import java.util.HashMap;

public class oneNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1, 2, 1, 3, 2, 5};
		int output[] = findSingleNumbers(nums);
		System.out.println(Arrays.toString(output));
		
	}

	public static int[] findSingleNumbers(int[] nums ) {
		int result[] = new int[2];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i=0; i< nums.length; i++) {
			if (! hm.containsKey(nums[i]))
			{
				hm.put(nums[i], 1);
			} else {
				hm.put(nums[i], hm.get(nums[i]) + 1);
			}
		}
		
			int j=0;
		
			for (int i=0; i< nums.length && j<2; i++) {
				
				if (hm.get(nums[i]) == 1) {
					result[j] = nums[i];
					j++;
				}
					
			}
			
			
		return result;
	}
}
