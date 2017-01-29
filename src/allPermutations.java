package myJavaLearning;

public class allPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permutation("abcd");
		
	}

	static void permutation (String str)
	{
		permutation("", str);
		
	}
	
	static void permutation(String perm, String str)
	{
		if (str.isEmpty())
			System.out.println(perm + str);
		else
		{
			for (int i=0; i< str.length(); i++)
			{
				permutation(perm + str.charAt(i), str.substring(0, i) + str.substring(i+1,str.length()));
			}
		}
			
	}
}
