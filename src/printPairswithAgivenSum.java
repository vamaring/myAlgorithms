package myJavaLearning;

import java.util.HashSet;
import java.util.Set;

public class printPairswithAgivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,6,7,8,9,1,2,3,4};
		int sumValue = 9;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int num : arr) {
			int target = sumValue - num;
			
			if (set.contains(target)) {
				//System.out.println("Matching sum pair found:" + "(" + num +"," + target +")");
				System.out.printf("(%d, %d) \n", num, target);
			} else
				set.add(num);
			
		}
				

	}

}
