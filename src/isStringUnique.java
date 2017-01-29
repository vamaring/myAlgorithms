package myJavaLearning;

public class isStringUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCDEFGHIJKLMNOPQRSTaA";
		int myarr[]= new int[128];
		boolean isUnique=true;
		char ch = 'A';
		
		
		for (int j=0; j<str.length(); j++)
			
		{
			System.out.println("Index locations are:" + (str.charAt(j) - 'A')); 
				
		}
		
		for (int i=0; i<str.length(); i++)
			
		{
			if (myarr[str.charAt(i) - 'A' ] == 0)
				{
					myarr[str.charAt(i) - 'A']++;
				}
			else
				{
					isUnique=false;
					ch = str.charAt(i);
					System.out.println("First duplicate character is: "+ch);
					break;
				}
		
		}
		
	System.out.println("Is the string " + str + " contains unique characters? " + isUnique);
	
	
	
	}

}
