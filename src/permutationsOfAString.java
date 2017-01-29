package myJavaLearning;

public class permutationsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "JSP";
		permutations(str);
		printQuotientRemainder(15,3);
		printQuotientRemainder(16,5);
	}

	private static void permutations(String str) {
		// TODO Auto-generated method stub
		permutations("",str);
	}

	private static void permutations(String perm, String input) {
		// TODO Auto-generated method stub
		
		if (input.length() == 0)
			System.out.println(perm);
		else{
			for (int i=0; i < input.length(); i++) {
				permutations(perm + input.charAt(i), input.substring(0, i) + input.substring(i+1, input.length()));
			}
		}
	}
	
	static void printQuotientRemainder( int a , int b) {
     
        if ( a == 0 || b == 0) {
           System.out.print("Number should not be zero");
        } 
        
        	int count = 0;
            int sum = 0;
            
            do {
                sum = sum + b;
                count++;
            } while ( a - sum >= b);
            
            
           /* while ( a - sum >= b) {
                sum = sum + b;
                count++;
            }
            */
            
            System.out.println("Quotient is: " +count);
            System.out.println("Remainder is: " + (a - sum));
            

}
}
