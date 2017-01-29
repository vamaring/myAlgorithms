package myJavaLearning;

import java.util.Arrays;

public class sortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10, 4, 5, 1, 6, 2, 3, 8};
		
		bubbleSort(arr);
		selectionSort(arr);
	}
	
	
	static void bubbleSort(int arr[]) {
		//int n = 3;
	    // for (int i = 0; i < n; i++) {
		for (int i = 0; i < arr.length; i++) {
	         for (int j = 0; j < arr.length - i - 1; j++) {
	             if (arr[j] > arr[j+1]){
	                 int temp = arr[j];
	                 arr[j] = arr[j+1];
	                 arr[j+1] = temp;
	             }
	         }
	     }
	     //System.out.println("After sorting " +n + " times");
		 System.out.println("After Bubble sort:");
	     System.out.println(Arrays.toString(arr));
	}
	
	 
     static void selectionSort(int arr[]) {
    	 int i, j, min, temp;
    	 for (i = 0; i < arr.length - 1 ; i++) {
    		 min = i;
    		 for (j = i + 1; j < arr.length; j++) {
    			 if (arr[j] < arr[min]) {
    				 min = j;
    			 }
    		 }
    		 temp = arr[min];
    		 arr[min] = arr[i];
    		 arr[i] = temp;
    	 }
    	 
    	 System.out.println("After Selection sort:");
         System.out.println(Arrays.toString(arr));
     }

    
}
