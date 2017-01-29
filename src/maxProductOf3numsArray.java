package myJavaLearning;

public class maxProductOf3numsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {-1, 2, 3, -4, -5, -2, -8, -4, 4};
		
		System.out.println(findMaxProduct(a));
	}

	private static int findMaxProduct(int[] a) {
		// TODO Auto-generated method stub
		int mPos;
		int mNeg;
		
		int pMax1=0,pMax2=0,pMax3=0;
		
		for (int i=0; i < a.length; i++){
			if (a[i] > 0) {
				if (a[i] > pMax3) {
					pMax1 = pMax2;
					pMax2 = pMax3;
					pMax3 = a[i];
				} else if (a[i] > pMax2) {
					pMax1 = pMax2;
					pMax2 = a[i];
				} else if (a[i] > pMax1) {
					pMax1 = a[i];
				}
				
			}
		}
		System.out.println("pMax1 = " +pMax1);
		System.out.println("pMax2 = " +pMax2);
		System.out.println("pMax3 = " +pMax3);
		return 1;
	}

}
