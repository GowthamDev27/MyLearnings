package java_concepts;

import java.util.Scanner;

public class Samsung extends Mobiles {
	static void samsungMobiles(String user_brand) {
		System.out.println("you selected "+user_brand);
		System.out.println("Do you want to explore it? yes or no?");
		Scanner scanner = new Scanner(System.in);
		String user_choice = scanner.next();
		

		switch(user_choice.toLowerCase()) {
		case "yes":
			
			System.out.println("Latest version is Samsung Galaxy S24");
			
			
			System.out.println("Do you want to explore it? yes or no?");
			String user_mobile_choice = scanner.next();
			switch(user_mobile_choice.toLowerCase()) {
			case "yes":
				SamsungGalaxy24.galaxy24Features(user_choice);
				break;
			default:
				System.out.println("Ok, Thank you...");
			}
			break;
		
		default:
			System.out.println("Ok, Thank you...");
		}
			
		
	}

}
