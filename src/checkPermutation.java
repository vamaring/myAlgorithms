package myJavaLearning;

import java.util.Arrays;

public class checkPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = isPermutationViaSort("abcd","bcde");
		System.out.println(b1);
		
		boolean b2 = isPermutationViaArray("abcd","bcde");
		System.out.println(b2);
		
	}

	static String sort(String str1)
	{
		char c1[] = str1.toCharArray();
		Arrays.sort(c1);
		return new String(c1);
	}
	
	static boolean isPermutationViaSort(String s1,String s2)
	{
		if (s1.length() != s2.length())
			return false;
		else
			return sort(s1).equals(sort(s2));
		
	}
	
	static boolean isPermutationViaArray(String s1, String s2)
	{
		char[] ch1 = new char[128];
		char[] ch2 = new char[128];
		
		if (s1.length() != s2.length())
			return false;
		
		for (int i=0; i < s1.length(); i++) {
			ch1[s1.charAt(i)]++;
		}
		
		
		for (int j=0; j < s2.length(); j++) {
			ch2[s2.charAt(j)]++;
		}
		
		return Arrays.equals(ch1, ch2);
	}

}