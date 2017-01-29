package myJavaLearning;

import java.util.LinkedHashMap;

public class longestSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str = "javaconceptoftheday";
		String str = "abcabcbb";
		findLongestSubString(str);
		
	}

	private static void findLongestSubString(String str) {
		// TODO Auto-generated method stub
		char ch[] = str.toCharArray();
		String longestSubStr = "";
		int longestSubStrLength = 0;
		
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character, Integer>();
		
		for (int i=0 ; i < ch.length; i++) {
			if (!hm.containsKey(ch[i])) {
				hm.put(ch[i], i);
			} else {
				i = hm.get(ch[i]);
				hm.clear();
			}
			System.out.println(hm);
			if (hm.size() > longestSubStrLength) {
				longestSubStrLength = hm.size();
				longestSubStr = hm.keySet().toString();
			}
		}
	System.out.println("Longest substring without repeating characters is:" +longestSubStr);
	
	}

}
