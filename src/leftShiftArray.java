package myJavaLearning;

import java.util.Arrays;

public class leftShiftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {6,8,10,12,14};
		
		int num_of_rotations = 4;
		
		int first = arr[0];
		
		for (int j= 0; j < num_of_rotations; j++) {
			for (int i= arr.length - 1; i > 0; i--) {
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
				displayArray(arr);
			}
			System.out.println();
			displayArray(arr);
		}
		
		
		
		
		

	}

	static void displayArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
