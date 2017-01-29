package myJavaLearning;

import java.util.Arrays;

public class twoArrayPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {2,1,3};
		int arr2[] = {7,8,9};
		
		int k=10;
		
		boolean result=false;
		
		// permutate arr1 & arr2 such that sum of corresponding elements in arr1 & arr2 >= k 
		
		
		for (int i=0; i < arr1.length - 1; i++) {
			
			int sum = arr1[i] + arr2[i];
			if (sum < k) {
				swap(arr1[i],arr1[i+1]);
			} else {
				result=true;
				displayArray(arr1);
				displayArray(arr2);
			}
		}
		
		
		
	}

	static void swap(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
	}
	
	static void displayArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
