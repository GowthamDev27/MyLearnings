package IphoneMobileShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MobilesList {
	protected static HashMap<String, String> buyerDetails = new HashMap<>();
	void iphoneMobileList(String LoginEntry) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> mobiles = new ArrayList<>();

		// Adding mobiles to the arraylist
		mobiles.add("iphone 12");
		mobiles.add("iphone 12 mini");
		mobiles.add("iphone 12 pro");
		mobiles.add("iphone 12 pro max");
		mobiles.add("iphone 13");
		mobiles.add("iphone 13 mini");
		mobiles.add("iphone 13 pro");
		mobiles.add("iphone 13 pro max");
		mobiles.add("iphone 14");
		mobiles.add("iphone 14 mini");
		mobiles.add("iphone 14 pro");
		mobiles.add("iphone 14 pro max");
		mobiles.add("iphone 15");
		mobiles.add("iphone 15 mini");
		mobiles.add("iphone 15 pro");
		mobiles.add("iphone 15 pro max");

		switch (LoginEntry.toLowerCase()) {
		case "admin":
			System.out.println("Available Mobiles in our shop:");
			System.out.println(mobiles);

			System.out.println("Add or remove or no?");
			String add_or_remove = scanner.next();
			switch (add_or_remove.toLowerCase()) {
			case "add":
				System.out.println("Enter a new mobile:");
				scanner.nextLine();
				String newMobile = scanner.nextLine();

				// Check mobile is already present in arrrayList
				if (!mobiles.contains(newMobile)) {
					mobiles.add(newMobile);
					System.out.println("The new mobile \"" + newMobile + "\" has been added.");
				} else {
					System.out.println("The mobile \"" + newMobile + "\" already exists in the list.");
				}
				break;

			case "remove":
				System.out.println("Enter a mobile name to remove:");
				String mobileName = scanner.nextLine();

				// Remove the mobile exists in the list
				if (mobiles.contains(mobileName)) {
					mobiles.remove(mobileName);
					System.out.println("The mobile \"" + mobileName + "\" has been removed.");
				} else {
					System.out.println("The mobile \"" + mobileName + "\" does not exist in the list.");
				}
				break;
			case "no":
				System.out.println("Do you want to see buyer details? yes or no:");
				String adminWish = scanner.next();
				switch(adminWish) {
				case "yes":
					if (buyerDetails.isEmpty()) {
						System.out.println("No purchases yet.");
					} else {
						System.out.println("Buyer Details:");
						for (String buyer : buyerDetails.keySet()) {
							System.out.println("Buyer: " + buyer + ", Purchase: " + buyerDetails.get(buyer));
						}
					}
					break;
				default:
					System.out.println("Ok thank you...");
					
				}
				
			}
			break;
			
		case "user":
			System.out.println("Available mobiles in our shop:");
			System.out.println(mobiles);
			System.out.println("Enter the mobile you want to purchase:");
			String userMobile = scanner.nextLine();
			if (mobiles.contains(userMobile)) {

				MobileDetails details = new MobileDetails();
				details.displayMobileDetails(userMobile);
			} else {
				System.out.println("Sorry, the mobile \"" + userMobile + "\" is not available.");
			}
			break;

		default:
			System.out.println("Access denied. Only 'admin' can modify the mobile list.");
		}

		
		
	}
	
}
