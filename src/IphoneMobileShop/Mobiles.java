package IphoneMobileShop;

import java.util.Scanner;

public class Mobiles extends WelcomePage{
	 Mobiles() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t\t\t***WELCOME TO OUR SHOP***");
		System.out.println("ADMIN OR USER:");
		String LoginEntry = scanner.next();
		MobilesList mobileList = new MobilesList();
		mobileList.iphoneMobileList(LoginEntry);
		
	}
	
}
