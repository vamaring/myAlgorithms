package myJavaLearning;

class superClass {
	static int val=5;
	void printMe(){
		System.out.println("Inside parentClass printMe");
	}
	
	void printMe(String str){
		System.out.println("Inside parentClass - overloaded printMe" +str);
		
	}
}

class subclass extends superClass{
	 void printMe(){
		 System.out.println("Inside subclass overridden printMe");
	 }
	 
	 void printMe(int a){
		 System.out.println("Inside subclass - overload method " + (char)a);
	 }
}


public class overloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subclass B = new subclass();
		B.printMe();
		B.printMe(97);
		B.printMe(" Hello");
		System.out.println(B.val);
		
		superClass A = new subclass();
		A.printMe();
		A.printMe(" Hello");
		
		System.out.println(++A.val);
		System.out.println(parentClass.val);
	}

}
