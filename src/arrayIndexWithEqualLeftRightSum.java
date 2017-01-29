package myJavaLearning;

public class arrayIndexWithEqualLeftRightSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,2,6,7};
		int equilibriumIndex = findIndex(arr);
		System.out.println("Equilibrium index is:" +equilibriumIndex);
}

	private static int findIndex(int[] arr) {
		
		// TODO Auto-generated method stub
		int leftSum = 0;
		int rightSum = 0;
		
		int totalSum = sum(arr);
		
		for (int i=1; i < arr.length; i++) {
			leftSum += arr[i-1];
			rightSum = totalSum - arr[i] - leftSum;
			
			if (leftSum == rightSum)
				return i;
		}
		return -1;
	}

	private static int sum(int[] arr) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i=0; i < arr.length ; i++ )
		{
			total += arr[i];
		}
		return total;
	}

}
