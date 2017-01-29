package myJavaLearning;

public class maxSumSubArray {

public static void main(String args[])
	
	{
		int a[] = {-1,3,-5,4,6,-1,2,-7,13,-3};
		//int a[] = {-1,-2,-3,-4,-5};
		//int a[] = {-1,3,-5,4,6};
		
		int maxSum = Integer.MIN_VALUE;
		int maxLeft =0,maxRight=0;
		int left=0,right = 0;
		int curMax=0;
		
		for (int i=0; i < a.length; i++) {
			
			curMax += a[i];
			
			if (curMax > maxSum) {
				
				maxSum = curMax;
				right = i;
				maxLeft = left;
				maxRight = right;
			}
			
			if (curMax < 0) {
				curMax = 0;
				left = left + 1;
				right = right + 1;
			}
		}
		
		System.out.println("Max sum is: " + maxSum + " and is found between indices " +maxLeft + " and "+maxRight);
	}

}
