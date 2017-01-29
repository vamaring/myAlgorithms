package myJavaLearning;

class parentClass {
	static int val=5;
	void printMe(){
		System.out.println("Inside parentClass printMe");
	}
	
	void printMe(String str){
		System.out.println("Inside parentClass - overloaded printMe" +str);
		
	}
}

class subClass extends parentClass{
	 void printMe(){
		 System.out.println("Inside subclass overridden printMe");
	 }
	 
	 void printMe(int a){
		 System.out.println("Inside subclass - overload method " + (char)a);
	 }
}
public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subClass B = new subClass();
		B.printMe();
		B.printMe(97);
		B.printMe(" Hello");
		System.out.println(B.val);
		
		parentClass A = new subClass();
		A.printMe();
		A.printMe(" Hello");
		
		System.out.println(++A.val);
		System.out.println(parentClass.val);
	}

}
