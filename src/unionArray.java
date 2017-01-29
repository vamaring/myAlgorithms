package myJavaLearning;
import java.util.*;

public class unionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = {1,2,4,4,6,8,8};
		int arr2[] = {6,6,8,9,10,10,11};
		
		Set<Integer> union = new HashSet<Integer>(arr1.length + arr2.length);
		Set<Integer> intersection = new HashSet<Integer>();
		
		
		for (int i=0; i<arr1.length; i++)
			union.add(arr1[i]);
		
		System.out.println(union);

		for (int j=0; j<arr2.length;j++){
			if (!union.add(arr2[j]))
				intersection.add(arr2[j]);
			
		}
		System.out.println(union);
		System.out.println(intersection);
	}

}
