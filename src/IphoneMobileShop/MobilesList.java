package IphoneMobileShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class MobilesList {
	Scanner scanner = new Scanner(System.in);
	  static HashMap<String, String> buyerDetails;
	  ArrayList<String> mobiles;
	  HashMap<String, String> userDetails;
	  ArrayList<HashMap> allUserDetails;
	MobilesList(){
	buyerDetails = new HashMap<>();
	userDetails = new HashMap<>();
	allUserDetails = new ArrayList<>();
	 mobiles = new ArrayList<>();

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
	}
	void iphoneMobileList(int LoginEntry) {
		try {
			switch (LoginEntry) {
			case 1:
				System.out.println("Available Mobiles in our shop:");
				for (int i = 1; i < mobiles.size(); i++) {
					System.out.println(i + ") " + mobiles.get(i));
				}
				System.out.println("\nWhat would you like to do?:\n");
				System.out.println("1) ADD\t2) REMOVE\t3) UPDATE\t4) VIEW BUYERS DETAILS");
				System.out.println("\nEnter the option:");
				int add_or_remove = scanner.nextInt();
				switch (add_or_remove) {
				case 1:
					System.out.println("Enter a new mobile:");
					scanner.nextLine();
					String newMobile = scanner.nextLine();

					// Check mobile is already present in arrrayList
					if (!mobiles.contains(newMobile)) {
						mobiles.add(newMobile);
						System.out.println("The new mobile \"" + newMobile + "\" has been added.");
						System.out.println("Updated mobiles list--->After added new mobile");
						for (int i = 1; i < mobiles.size(); i++) {
							System.out.println(i + ") " + mobiles.get(i));
						}
					} else {
						System.out.println("The mobile \"" + newMobile + "\" already exists in the list.");
					}
					break;

				case 2:
					System.out.println("Enter a mobile name to remove:");
					scanner.nextLine();
					String mobileName = scanner.nextLine();

					// Remove the mobile exists in the list
					if (mobiles.contains(mobileName)) {
						mobiles.remove(mobileName);
						System.out.println("The mobile \"" + mobileName + "\" has been removed.");
						System.out.println("Updated mobiles list--->After remove");
						for (int i = 1; i < mobiles.size(); i++) {
							System.out.println(i + ") " + mobiles.get(i));
						}
					} else {
						System.out.println("The mobile \"" + mobileName + "\" does not exist in the list.");
					}
					break;
				case 3:
					System.out.println("Enter a mobile index to update:");
					int mobileIndex = scanner.nextInt();
					System.out.println("Enter a mobile name to Change:");
					scanner.nextLine();
					String mobileUpdate = scanner.nextLine();

					// Remove the mobile exists in the list
					if (!mobiles.contains(mobileUpdate)) {
						mobiles.set(mobileIndex, mobileUpdate);
						System.out.println("The mobile \"" + mobileUpdate + "\" has been updated.");
					} else {
						System.out.println("The mobile \"" + mobileUpdate + "\" already exist in the list.");
					}
					System.out.println("Updated Mobile list--->After update");
					break;
				case 4:
					System.out.println("Do you want to see buyer details? yes or no:");
					String adminWish = scanner.next();
					switch (adminWish) {
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

			case 2:
				System.out.println("1) Existing user\t2) New user");
				System.out.println("Enter the option:");
				int userType = scanner.nextInt();

				switch (userType) {
				case 1:
					existingUser(userType);
					break;
				case 2:
					newUserRegistration(userType);

				}

//				 default:
//					System.out.println("Access denied. Only 'admin' can modify the mobile list.");
			}

		}catch(Exception e) {
			
			System.out.println(e);
		}

		
	}

	void existingUser(int userType) {
		System.out.println("Available mobiles in our shop:");
		for (int i = 1; i < mobiles.size(); i++) {
			System.out.println(i + ") " + mobiles.get(i));
		}
		System.out.println("Enter the mobile you want to purchase:");
		scanner.nextLine();
		String userMobile = scanner.nextLine();
		mobilePurchase(userMobile);
	}

	void newUserRegistration(int userType) {
		System.out.println("USER REGISTRATION");
		System.out.println("Enter user name:");
		String user_name = scanner.next();

		System.out.println("Enter email id:");
		scanner.nextLine();
		String user_email_id = scanner.nextLine();
		System.out.println("Enter your password:");
		String user_password = scanner.nextLine();
		// adding user details
		userDetails.put("userName", user_name);
		userDetails.put("userEmail", user_email_id);
		userDetails.put("userPassword", user_password);
		// adding user details into array list
		allUserDetails.add(userDetails);
		System.out.println("User Registration Successfully done");
		System.out.println(allUserDetails);
		System.out.println("Available Mobiles in our shop");
		for (int i = 1; i < mobiles.size(); i++) {
			System.out.println(i + ") " + mobiles.get(i));
		}
		System.out.println("Enter the mobile you want to purchase:");
		String userMobile = scanner.nextLine();
		mobilePurchase(userMobile);
		
	}
	void mobilePurchase(String userMobile) {
		if (mobiles.contains(userMobile)) {

			MobileDetails details = new MobileDetails();
			details.displayMobileDetails(userMobile);
		} else {
			System.out.println("Sorry, the mobile \"" + userMobile + "\" is not available.");
		}
		
	}

}
