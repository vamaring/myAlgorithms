package myJavaLearning;

import java.util.Arrays;

public class removeDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6 };
        removeDups(arr);
        
	}

	private static void removeDups(int[] arr) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int i = 0;
		int result[] = new int[arr.length];
		
		for (int num : arr) {
			
			if (!isExists(result, num)) {
				result[i++] = num;
				count++;
			}
		}
		
		for (int k=0; k < count; k++)
			System.out.println(result[k]);
		
		System.out.println(Arrays.toString(result));
		
		
	}

	private static boolean isExists(int[] result, int num) {
		// TODO Auto-generated method stub	
		for (int j : result) {
			if (j == num)
				return true;
		}
		return false;
	}

}
