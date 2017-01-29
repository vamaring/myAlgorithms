package myJavaLearning;

public class reverseArraySubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3,4,5,6,7,8,9};
		// output must be 4,3,2,1,8,7,6,5,9
		int N = 4;
		int arrLen = arr.length;
		for (int i=0; i < arr.length; i = i + N) {
			
			
			int leftIndex = i;
			int rightIndex = i+N;
			
			rightIndex = (rightIndex > arrLen) ? arrLen - 1 : rightIndex - 1;
			
			while (leftIndex < rightIndex) {
				int temp = arr[leftIndex];
				arr[leftIndex] = arr[rightIndex];
				arr[rightIndex] = temp;
				leftIndex++;
				rightIndex--;
			}
		}
		
		printArray(arr);
	}
	
	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

}
