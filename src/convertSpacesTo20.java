package myJavaLearning;

public class convertSpacesTo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Mr John Smith    ";
		String op = replaceSpacesUsingStringBuilder(str,13);
		System.out.println(op);
		System.out.println();
		replaceSpacesUsingCharArray(str,13);
		
	}

	static String replaceSpacesUsingStringBuilder (String str,int len)
	{
		StringBuilder sb = new StringBuilder("");
			for (int i=0; i < len ; i++)
			{
					if (str.charAt(i) == ' ')
						
						sb.append("%20");
					else
						sb.append(str.charAt(i));	
			}	
		return sb.toString();
	}
	
	static void replaceSpacesUsingCharArray (String str,int len)
	{
		// Count number of spaces
		
		char ch[] = str.toCharArray();
		
		int index=0,spaceCount=0;
		
		for (int i=0; i < len; i++)
		{
			if (ch[i] == ' ')
				spaceCount++;
		
		}
		System.out.println("Number of spaces are:" +spaceCount);
		
		index = len + 2 * spaceCount; // Final length of string to be generated
		System.out.println("Final string lenth will be:" +index);
		
		//String str = "Mr John Smith   ";
		//String opt = "Mr%20John%20Smith";
		for (int j = len-1; j>=0 ; j--)
		{
			if (ch[j] == ' ')
			{
				ch[index-1]='0';
				ch[index-2]='2';
				ch[index-3]='%';
				index = index -3 ;
			}
			
			else {
				ch[index-1] = ch[j];
				index--;
			}
		}
		
		System.out.println(ch);
	
	}
}
