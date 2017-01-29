package myJavaLearning;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StairCase(8);
		
		
	
	}

	static void StairCase(int n) {
			String hashes = "";
			for (int i = 1; i <=n ; i++) {
				
				for (int j = n - i; j > 0 ; j--) {
					
					System.out.print(" ");
				}
				hashes += "#";
				System.out.println(hashes);
			}
			
			
    }

}
