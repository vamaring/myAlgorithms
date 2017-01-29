package myJavaLearning;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarr[] = {7,4,3,6,2};
		
		for (int i=0; i < myarr.length; i++)
		{
			for (int j=0; j <(myarr.length - i-1); j++)
				
			{
				if (myarr[j] > myarr[j+1]) 
						{
							int temp = myarr[j+1];
							myarr[j+1]= myarr[j];
							myarr[j] = temp;
							
						}
			}
		}
		
		System.out.println("Sorted Array is:" );
		for (int i=0; i < myarr.length; i++)
		System.out.println(myarr[i]);
		
		
		maxProductinArray(myarr);
	}

	
	static void maxProductinArray(int arr[])
	{
		int product;
		int len = arr.length;
		
		for (int i=0; i <2; i++)
		{
			for (int j=0; j <(arr.length - i-1); j++)
				
			{
				if (arr[j] > arr[j+1]) 
						{
							int temp = arr[j+1];
							arr[j+1]= arr[j];
							arr[j] = temp;
							
						}
			}
		}
		
		product = arr[len-1] * arr[len-2];
		System.out.println("maxProduct is: " +product );
	}
}
