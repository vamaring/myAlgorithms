package myJavaLearning;

public class secondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {6,9,15,28,12,20,25};
		
		int firstLargest;
		int secondLargest;
		
		if (a[0] > a[1]) {
			firstLargest = a[0];
			secondLargest = a[1];
		} else {
			firstLargest = a[1];
			secondLargest = a[0];
		}
		
		for (int i=2; i < a.length; i++) {
			if (a[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = a[i];
				
			} else if (a[i] < firstLargest && a[i] > secondLargest)
				secondLargest = a[i];
		}
		
		System.out.println("Largest element is: " +firstLargest);
		System.out.println("Second largest element is: " +secondLargest);
	}

}
