package myJavaLearning;

public class palindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//boolean isPalindrome = checkPalindromePermutation("TactCoa");
		boolean isPalindrome = checkPalindromePermutation("travel");
		//boolean isPalindrome = checkPalindromePermutation("Tact Coa");
		System.out.println(isPalindrome);
	}

	static boolean checkPalindromePermutation(String str)
	{	
		String str2 = str.toLowerCase();
		int oddCharCount = 0;
		
		int chArray[] = new int[128];
		for (int i=0; i < str2.length(); i++)
		{
			chArray[str2.charAt(i)]++;
		}
		
		for (int i=0; i < str2.length(); i++)
		{
			if ((chArray[str2.charAt(i)] % 2) == 1)
			{
				oddCharCount++;
			}
		}
		
		if (oddCharCount <= 1)
		     return true;
		else
			return false;
	
	}
}
