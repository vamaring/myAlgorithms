package myJavaLearning;

public class DuplicateElementsWithinDistanceK {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			int arr[] = {2, 4, 1, 3, 2, 1, 4, 1 };
			int k = 3;
			boolean isDuplicate = DuplicateElementsWithinK(arr,k);
			System.out.println(isDuplicate);
		}
		 
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
			
		}
			
	}

	private static boolean DuplicateElementsWithinK(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		if (arr == null || k < 1) {
            throw new RuntimeException("Invalid input");
        }
 
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            int repetitions = 0;
 
            // Check for next k elements
            while (repetitions < k && j < arr.length) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is present at " + i + " and "
                            + j);
                    return true;
                }
                repetitions++;
                j++;
            }
        }
        return false;
    }
	

}
