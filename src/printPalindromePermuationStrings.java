package myJavaLearning;

public class printPalindromePermuationStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabcb";
		int oddCharCount = 0;
		int evenCharAray[] = new int[128];
		char oddChar = 'A';
		int chArray[] = new int[128];
		for (int i=0; i < str.length(); i++)
		{
			chArray[str.charAt(i)]++;
		}
		
		for (int i=0; i < str.length(); i++)
		{
			if ((chArray[str.charAt(i)] % 2) == 1)
			{
				oddCharCount++;
				System.out.println("Character occuring odd number of times is:" +str.charAt(i));
				oddChar = str.charAt(i);
			}
		}
		
		for (int i=0; i < 128; i++)
		{
			if ((chArray[i] / 2) > 0)
			{
				System.out.println("Characters occuring even number of times:" + (char)i);
			}
		}
		
		if (oddCharCount > 1)
			System.out.println("No Palindrome Permutation Strings are possible");
		else
		{
			int mid = str.length()/2;
			
		}
		
		
		
		
	}

	 
}
