package java_concepts;

public class SamsungGalaxy24 extends Samsung {
	static void galaxy24Features(String user_choice) {
	String[] samsungGalaxyS24Features = {
		    "AI-enhanced features like live voice translation and Circle to Search",
		    "Improved performance with Exynos 2400 and Snapdragon 8 Gen 3 chipsets",
		    "Seven years of OS updates for extended device longevity",
		    "Durable design with Gorilla Glass Victus 2 and IP68 water resistance",
		    "4000mAh battery with efficient power management for full-day usage"
		};
		switch(user_choice.toLowerCase()) {
		case "yes":
			System.out.println("***Samsung Galaxy S24 Features***");
			for(int i=0;i<samsungGalaxyS24Features.length;i++) {
				System.out.println(samsungGalaxyS24Features[i]);
			
			}
			break;
		case "no":
			System.out.println("Would you like to go back? yes or no?");
			Samsung.samsungMobiles(user_choice);
			break;
		default:
			System.out.println("Ok, Thank you...");
		
	}
}

}
