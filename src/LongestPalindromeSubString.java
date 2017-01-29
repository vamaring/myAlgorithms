package myJavaLearning;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "bbabcba";
		String result = longestPalindrome(str);
		System.out.println(result);
		
	}

	private static String longestPalindromeSubString(String str) {
		// TODO Auto-generated method stub
		int longLength = 0;
		String longestString = "";
		String subS="";
		for (int i =0; i < str.length(); i++) {
			for (int j=i+1; j <= str.length(); j++) {
				subS = str.substring(i, j);
				if (isPalindrome(subS)) {
					if (subS.length() > longLength) {
						longLength = subS.length();
						longestString = subS;
					}
				}
			}
		}
		
		return longestString;
	}

	public static boolean isPalindrome(String word) {
		
		if (word != null && !word.isEmpty()) {
			String rev = new StringBuffer(word).reverse().toString();
			return word.equalsIgnoreCase(rev);
		}
		return false;
	}

	public static String longestPalindrome(String s) {
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = expandAroundCenter(s, i, i);
	        int len2 = expandAroundCenter(s, i, i + 1);
	        System.out.println("len1 = "+len1 +" len2 = " +len2);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    System.out.println("start = " +start + " end = " +end);
	    return s.substring(start, end + 1);
	}

	
	private static int expandAroundCenter(String s, int left, int right) {
	    int L = left, R = right;
	    System.out.println("R = "+R +" L = " +L);
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    System.out.println("R = "+R +" L = " +L);
	    return R - L - 1;
	    
}
	
}
