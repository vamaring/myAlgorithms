package myJavaLearning;

public class StringMisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To find number of occurances of a character without using any loop.
		
		String name = "Vamshi Krishna Maringanti";
		String replacedName = name.replace("i", "");
		System.out.println(replacedName);
		int count = name.length() - replacedName.length();
		System.out.println(count);
		
	
		// To find if two strings are rotated
		// Ex If “JavaJ2eeStrutsHibernate” is a string then below are some rotated versions of this string.
		// “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava”, “HibernateJavaJ2eeStruts”.
		
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		
		String s3 = s1 + s1;
		
		if (s3.contains(s2)) {
			System.out.printf("%s and %s are rotations of each other", s1, s2);
			System.out.println();
		} else {
			System.out.printf("%s and %s are not rotations of each other", s1, s2);
			
		}
		
		
		
		// If “I Am Not String” is the given string 
		// then the reverse of this string with preserving the position of spaces is “g ni rtS toNmAI”
		
		String str = "I Am Not String";
		
		char ch[] = str.toCharArray();
		char result[] = new char[str.length()];
		
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ')
				result[i] = ' ';
		}
		
		int j = str.length() - 1;
		
		for (int i=0; i < str.length(); i++) {
			if (ch[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = ch[i];
				j--;
			}
				
		}
		System.out.println(new String(result));
		System.out.println(String.valueOf(result));
		
		
		// If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”.
		
		String myStr = "Java Concept Of The Day";
		String eachWord[] = myStr.split(" ");
		String revStr = "";
		
		for (int i = 0; i < eachWord.length; i++) {
			String word = eachWord[i];
			String revWord = "";
			
			for (int k=word.length() - 1 ; k >= 0; k--) {
				revWord += word.charAt(k);
			}
			//revStr = revStr + revWord + " ";
			revStr = revWord + " " +revStr ;
		}
		
		System.out.println(revStr);
		
		
		// Swap two String variables without using a temp variable

		String str1 = "Java";
		String str2 = "Python";
		
		System.out.println("Before Swapping: str1 = " +str1);
		System.out.println("Before Swapping: str2 = " +str2);
		
		str1 = str1 + str2; //JavaPython
		
		str2 = str1.substring(0,str1.length()-str2.length());
		
		str1 = str1.substring(str2.length());
		
		System.out.println("After Swapping: str1 = " +str1);
		System.out.println("After Swapping: str2 = " +str2);
		
		
		// All permutations of a given string

		
		
	}

}
