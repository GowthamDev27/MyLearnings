package PolymorphismPractice;

class arithmeticOperstions{
	void addition(int a,int b) {
		int sum = a+b;
		System.out.println("Addition: "+sum);
	}
	void addition(int a,int b, int c) {
		int sum = a+b+c;
		System.out.println("Addition: "+sum);
	}
}

public class polymorphismTask {

	public static void main(String[] args) {
		arithmeticOperstions obj = new arithmeticOperstions();
		obj.addition(4,5);
		
	}
}
