package java_concepts;

import java.util.Scanner;

public class Electronics {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***Welcome to our mobile shop***");
		System.out.println("Choose yes or no to continue:");
		String user_choice = scanner.next();
		Mobiles mobiles = new Mobiles();
		Mobiles.mobileBrands(user_choice);
		
		
	}

}
