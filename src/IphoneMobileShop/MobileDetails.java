package IphoneMobileShop;

import java.util.HashMap;
import java.util.Scanner;

public class MobileDetails extends MobilesList {
	// HashMap to store mobile specifications and prices
	private HashMap<String, String> mobileSpecs = new HashMap<>();
	private HashMap<String, Integer> mobilePrices = new HashMap<>();

	// Constructor to initialize mobile specs and prices
	MobileDetails() {
		// Add specs and prices for mobiles
		mobileSpecs.put("iphone 12", "A14 Bionic, 6.1-inch Display, Dual-Camera");
		mobileSpecs.put("iphone 12 mini", "A14 Bionic, 5.4-inch Display, Dual-Camera");
		mobileSpecs.put("iphone 12 pro", "A14 Bionic, 6.1-inch Display, Triple-Camera, LiDAR");
		mobileSpecs.put("iphone 12 pro max", "A14 Bionic, 6.7-inch Display, Triple-Camera, LiDAR");

		mobileSpecs.put("iphone 13", "A15 Bionic, 6.1-inch Display, Dual-Camera");
		mobileSpecs.put("iphone 13 mini", "A15 Bionic, 5.4-inch Display, Dual-Camera");
		mobileSpecs.put("iphone 13 pro", "A15 Bionic, 6.1-inch Display, Triple-Camera, LiDAR");
		mobileSpecs.put("iphone 13 pro max", "A15 Bionic, 6.7-inch Display, Triple-Camera, LiDAR");

		mobileSpecs.put("iphone 14", "A15 Bionic, 6.1-inch Display, Emergency SOS");
		mobileSpecs.put("iphone 14 plus", "A15 Bionic, 6.7-inch Display, Emergency SOS");
		mobileSpecs.put("iphone 14 pro", "A16 Bionic, 6.1-inch Display, Always-On Display, Dynamic Island");
		mobileSpecs.put("iphone 14 pro max", "A16 Bionic, 6.7-inch Display, Always-On Display, Dynamic Island");

		mobileSpecs.put("iphone 15", "A16 Bionic, 6.1-inch Display, USB-C");
		mobileSpecs.put("iphone 15 plus", "A16 Bionic, 6.7-inch Display, USB-C");
		mobileSpecs.put("iphone 15 pro", "A17 Pro, 6.1-inch Display, USB-C, Titanium Body");
		mobileSpecs.put("iphone 15 pro max", "A17 Pro, 6.7-inch Display, USB-C, Titanium Body, 5x Telephoto Camera");

		// Add prices for all iPhone variants
		mobilePrices.put("iphone 12", 699);
		mobilePrices.put("iphone 12 mini", 599);
		mobilePrices.put("iphone 12 pro", 999);
		mobilePrices.put("iphone 12 pro max", 1099);

		mobilePrices.put("iphone 13", 799);
		mobilePrices.put("iphone 13 mini", 699);
		mobilePrices.put("iphone 13 pro", 1099);
		mobilePrices.put("iphone 13 pro max", 1199);

		mobilePrices.put("iphone 14", 899);
		mobilePrices.put("iphone 14 plus", 999);
		mobilePrices.put("iphone 14 pro", 1199);
		mobilePrices.put("iphone 14 pro max", 1299);

		mobilePrices.put("iphone 15", 999);
		mobilePrices.put("iphone 15 plus", 1099);
		mobilePrices.put("iphone 15 pro", 1299);
		mobilePrices.put("iphone 15 pro max", 1399);
	}

	void displayMobileDetails(String userMobile) {
		if (mobileSpecs.containsKey(userMobile)) {
			System.out.println("**********************");
			System.out.println("* MOBILE NAME: " + userMobile);
			System.out.println("* SPECIFICATIONS: " + mobileSpecs.get(userMobile));
			System.out.println("* PRICE: $" + mobilePrices.get(userMobile));
			System.out.println("**********************");
			System.out.println("Do you want to purchase this mobile? (yes/no)");

			Scanner scanner = new Scanner(System.in);
			String choice = scanner.next();

			if (choice.equalsIgnoreCase("yes")) {
				System.out.println("Enter your name:");
				String buyerName = scanner.next();

				MobilesList.buyerDetails.put(buyerName, userMobile + " - $" + mobilePrices.get(userMobile));

				System.out.println("Thank you for your purchase, " + buyerName + "!");
			} else {
				System.out.println("No worries! Browse other options.");

			}
		} else {
			System.out.println("Sorry, the mobile \"" + userMobile + "\" is not available.");
		}
	}

}
