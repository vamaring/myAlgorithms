package myJavaLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1 ; i <=15; i++) {
			
			if ( i % 3 == 0 && i % 5 == 0)
				System.out.println("FizzBuzz");		
			else if (i %3 == 0)
				System.out.println("Fizz");
			else if (i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
			
		}
		
		int arr[] = {4,3,2,7,8,2,3,1};
		
		for (int i=0; i < arr.length; i++) {
			while( arr[i] != i+1 && arr[i] != arr[arr[i] -1] ){
				int temp = arr[i];
				//System.out.println("temp="+temp);
				arr[i] = arr[temp - 1];
				//System.out.println("arr[i] = "  +arr[i]);
				arr[temp - 1 ] = temp;
				System.out.println(Arrays.toString(arr));
			}
		}
		
		
				
		List<Integer> missingNums = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i+1) {
				missingNums.add(i+1);
			}
		}
				System.out.println("Missing numbers are: " +missingNums);
	}

	


	
	
}
