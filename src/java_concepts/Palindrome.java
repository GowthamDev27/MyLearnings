package java_concepts;

// palindrome program with overloading concept in polymorphism

import java.util.Scanner;
class PalindromeProgram{
	void palindromProgram(int value) {
		int remainder=0;
		int reverse = 0;
		int orginalValue = value;
		
		while(value>0) {
			remainder = value % 10;
            reverse = reverse * 10 + remainder;
            value = value / 10;	
		}
		if(orginalValue == reverse) {
			System.out.println("Given Value"+orginalValue);
        	System.out.println("Reversed Value"+reverse);
        	System.out.println("The given value is palindrom");
        	
        }
        else {
        	System.out.println("Given Value is "+orginalValue);
        	System.out.println("Reversed Value is "+reverse);
        	System.out.println("The given value is not a palindrom");
        }
		
	}
	void palindromProgram(String word) {
		String originalString = word;
		String reverseString ="";
		for(int i = originalString.length()-1;i>=0;i--) {
			reverseString = reverseString+word.charAt(i);
			
		}
		if(originalString.equals(reverseString)) {
			System.out.println("Given String is "+originalString);
        	System.out.println("Reversed String is "+reverseString);
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("Given String is "+originalString);
        	System.out.println("Reversed String is "+reverseString);
			System.out.println("The given string is not a palindrome");
		}
		
	}
}

public class Palindrome {
	public static void main(String arg[]) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number to check palindrome");
		int number = scanner.nextInt();
		System.out.println("Enter the String to check palindrome");
		scanner.nextLine();
		String studentName = scanner.nextLine();
		PalindromeProgram palindromeProgram = new PalindromeProgram();
		palindromeProgram.palindromProgram(number);
		palindromeProgram.palindromProgram(studentName);
		
	}	

}
