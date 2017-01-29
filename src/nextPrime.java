package myJavaLearning;

public class nextPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 19;
		
		for (int i= num + 1 ; i < 2 * num; i++) {
			
			if (isPrime(i)) {
				System.out.println("Next prime is :" +i);
				break;
			}
		}
	}
	
	static boolean isPrime(int n) {
		boolean prime = true;
		
		for (int j=2 ; j < Math.sqrt(n); j++) {
			
			if (n % j == 0)
				prime = false;
		}
		return prime;
	}

}
