package myJavaLearning;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("String reverse Iterative - :" +reverseIterative("Vamshi"));
		System.out.println("String reverse Recursive - :" +reverseRecursive("Vamshi"));
		
	}

	static String reverseIterative(String str) {
		String revStr="";
		
		for (int i=str.length() -1 ; i>=0; i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
	
	static String reverseRecursive(String s) {
		if (s.length() == 1)
			return s;
		else 
			return reverseRecursive(s.substring(1)) + s.charAt(0);
		
	}
	
	
}
