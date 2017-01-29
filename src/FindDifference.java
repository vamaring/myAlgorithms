package myJavaLearning;

class FindDifference 
{
    static int equilibrium(int arr[]) 
    {
        int i, j, n;
        int leftsum, rightsum;
        n=arr.length;
        int found = 0;
 
        /* Check for indexes one by one until an equilibrium
           index is found */
        for (i = 0; i < n; ++i) 
        {
            leftsum = 0;  // initialize left sum for current index i
            rightsum = 0; // initialize right sum for current index i
 
            /* get left sum */
            for (j = 0; j < i; j++)
                leftsum += arr[j];
 
            /* get right sum */
            for (j = i + 1; j < n; j++)
                rightsum += arr[j];
 
            /* if leftsum and rightsum are same, then we are done */
            if (leftsum == rightsum) {
            	found = 1;
            	System.out.println("Index is:" +i);
            }
                
        }
 
        /* return -1 if no equilibrium index is found */
        return found;
    }
 
    public static void main(String[] args) 
    {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibrium(arr));
    }
}