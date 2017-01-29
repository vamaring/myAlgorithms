package myJavaLearning;

public class stringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "test";
		String b = "test";
		String c = new String("test");
		
		if (a == b)
			System.out.println("a == b");
		else
			System.out.println("They are different objects");
		
		System.out.println("a == b? " + (a==b));
		System.out.println("a.equals(b) ? " + a.equals(b));
		
		
		System.out.println("b == c? " + (b==c));
		System.out.println("b.equals(c) ? " + b.equals(c));
		
	}

}
