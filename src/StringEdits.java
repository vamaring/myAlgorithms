package myJavaLearning;

public class StringEdits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneEditAway("pale","ple"));
		System.out.println(oneEditAway("pales","pale"));
		System.out.println(oneEditAway("pale","bale"));
		System.out.println(oneEditAway("aple","apple"));
		
		System.out.println(oneEditAway("pale","bae"));
		//System.out.println(oneEditAway("pale","pael"));
		
		
	}

	static boolean oneEditAway(String s1,String s2)
	{
		if (s1.length() == s2.length())
		{
			return oneEditReplace(s1,s2);
		}
		else if (s1.length() + 1 == s2.length())
		{
			return oneEditInsert(s1,s2);
		}
		else if (s1.length() -1 == s2.length())
		{
			return oneEditInsert(s2,s1);
		}
	
		return false;
	}

	private static boolean oneEditReplace(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean isReplaced = false;
		
		for (int i=0; i<s1.length(); i++)
		{
			if (s1.charAt(i)!=s2.charAt(i))
			{
				if (isReplaced)
					return false;
			}
			
			isReplaced = true;
		}
		
		return true;
	}

	private static boolean oneEditInsert(String s1, String s2) {
		// TODO Auto-generated method stub
		// Checking if you can add a character to s1 to make it s2
		int index1 = 0;
		int index2=0;
		
		while(index2 < s2.length() && index1 < s1.length())
		{
			if (s1.charAt(index1) == s2.charAt(index2))
				{
					index1++;
					index2++;
				}
			else
				{
					if (index1 != index2)
					{
						return false;
					}
					index2++;
				}
		}
		
		return true;
	}
}
