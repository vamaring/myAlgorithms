package myJavaLearning;

public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Output should be a2b1c4a3`

		String overallresult = checkOverallCount("aabccccaaa");
		System.out.println(overallresult);
		
		String result = checkCount("aaaaccaa");
		System.out.println(result);
	}

	
	static String checkCount(String str)
	{
		StringBuilder compressedString = new StringBuilder();
		int count = 0;
		
		for (int i = 0; i < str.length(); i++)
		{	
			
			count++;
			if (i + 1 == str.length() || str.charAt(i) != str.charAt(i+1))
			{
				compressedString.append(str.charAt(i));
				compressedString.append(count);
				count=0;
			}
					
		}
		
		return compressedString.length() < str.length() ? compressedString.toString() : str;
	}
	
	static String checkOverallCount(String s)
	{
		int chArray[] = new int[128];
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<s.length(); i++)
		{
			chArray[s.charAt(i)]++;
		}
		
		for (int i=0; i<128; i++)
		{
			if (chArray[i] > 0 )
				{
					sb.append((char)i);
					sb.append(chArray[i]);
				}
					
		}
		
		return sb.toString();
		
		
	}
}
