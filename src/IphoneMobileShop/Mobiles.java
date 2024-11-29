package IphoneMobileShop;

import java.util.Scanner;

public class Mobiles extends WelcomePage{
//	constructor
	 Mobiles() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t\t\t***WELCOME TO OUR SHOP***");
		System.out.println("1) ADMIN\t2) USER");
		System.out.println("Enter the option:");
		int LoginEntry = scanner.nextInt();
		MobilesList mobileList = new MobilesList();
		mobileList.iphoneMobileList(LoginEntry);
		
	}

	
}
