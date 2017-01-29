package myJavaLearning;

import java.util.Arrays;
import java.util.Scanner;

public class leftShiftArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        
	        int a[] = new int[n];
	        for(int i=0; i < n; i++){
	            a[i] = in.nextInt();
	        }
	        
	     
	        
	        for (int i=0; i < k; i++) {
	        	for (int j=0; j < a.length - 1; j++) {
		        	int temp = a[j];
		        	a[j] = a[j+1];
		        	a[j+1] = temp;
		        	displayArray(a);
		        }
	        	System.out.println();
	        }
	        
	        System.out.print("Array after " +k + " left rotations is:");
	        displayArray(a);
	}

	
	static void displayArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
