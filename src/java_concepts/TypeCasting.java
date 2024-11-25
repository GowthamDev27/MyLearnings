package java_concepts;

import java.util.Scanner;

class CastingType {
	void intToString(int value1) {
		String val1;

		val1 = Integer.toString(value1);
		System.out.println("After convert to String");
		System.out.println(val1 + 1);
	}

	void stringToInt(String str) {

		int val1;
		val1 = Integer.parseInt(str);
		System.out.println("After convert to Integer");
		System.out.println(val1 + 1);

	}
}

public class TypeCasting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CastingType obj = new CastingType();
		System.out.println("Enter the Intenger value:");
		int num = in.nextInt();
		System.out.println("Enter the string value:");
		String str = in.next();
		obj.stringToInt(str);
		obj.intToString(num);
		

	}

}
