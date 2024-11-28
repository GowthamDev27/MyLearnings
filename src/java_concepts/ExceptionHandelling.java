package java_concepts;

import java.util.Scanner;

class ArException{
	void ArithmeticException(int val1) {
		try {
			int ans =val1/10;
			System.out.println(ans);
			throw new custException("Divided by zero exception");
		}
		catch(custException e) {
			System.out.println(e); 
		}
		
	}
}
class custException extends Throwable{
	custException(String message){
		System.out.println(message);
	}
}

public class ExceptionHandelling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num:");
		int a = in.nextInt();
		ArException obj = new ArException();
		obj.ArithmeticException(a);
		

	}

}
