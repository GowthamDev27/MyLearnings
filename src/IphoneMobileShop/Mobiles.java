package IphoneMobileShop;

import java.util.Scanner;

public class Mobiles extends WelcomePage{
//	constructor
	 Mobiles() {
		 try {
			 Scanner scanner = new Scanner(System.in);
				System.out.println("\t\t\t***WELCOME TO OUR SHOP***");
				System.out.println("1) ADMIN\t2) USER");
				System.out.println("Enter the option:");
				int LoginEntry = scanner.nextInt();
				//Exception throwing
				if(LoginEntry > 2 || LoginEntry <=0) {
					throw new EnterValidOptionException("Please enter correct option ( 1 or 2)");
				}
				MobilesList mobileList = new MobilesList();
				mobileList.iphoneMobileList(LoginEntry);
				
		 }catch(EnterValidOptionException e) {
			e.printStackTrace(); 
			 
		 }
		
	}

	
}
