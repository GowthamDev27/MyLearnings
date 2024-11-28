package java_concepts;

import java.util.Scanner;

public class Mobiles extends Electronics {
	static Scanner scanner = new Scanner(System.in);
	static String brands[] = { "samsung", "iphone", "realme", "oneplus" };

	static void mobileBrands(String user_choice) {
		switch (user_choice.toLowerCase()) {
		case "yes":
			System.out.println("Mobile Brands:");
			for (int i = 0; i < brands.length; i++) {
				System.out.println(brands[i]);
			}
			System.out.println("Choose the brand");
			String user_brand = scanner.next();
			switch (user_brand.toLowerCase()) {
			
			case "samsung":
				Samsung.samsungMobiles(user_brand);
				break;
			case "iphone":
				Iphone.iPhoneMobiles(user_brand);
				break;

			case "realme":
				Realme.realmeMobiles(user_brand);
				break;
			case "oneplus":
				Oneplus.onePlusMobiles(user_brand);
				break;
			}
			break;
		case "no":
			System.out.println("Ok, Thank you...\nBye!!!");
			break;
		}

	}
}
