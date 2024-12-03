package java_concepts;

import java.util.Scanner;

public class CountOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string");
		String studentName = scanner.nextLine();
		int count = 0;
		// Count of characters in a string
		for (int i = 0; i < studentName.length(); i++) {
			count = count + 1;
		}
		System.out.println(count);

//		String Reverse

		String reversedString = "";
		for (int i = studentName.length() - 1; i >= 0; i--) {
			reversedString = reversedString + studentName.charAt(i);
		}
		System.out.println(reversedString);

//		String buffer or builder
		StringBuffer stringbuffer = new StringBuffer(studentName);
		stringbuffer.reverse().toString();
		System.out.println("String Builder: " + stringbuffer);
		
					

	}

}
