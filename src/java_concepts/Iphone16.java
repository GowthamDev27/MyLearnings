package java_concepts;

public class Iphone16 extends Iphone {
	static void iphone16Mobile(String user_choice) {
		String[] iPhone16Features = {
			    "Apple Intelligence Integration",
			    "Spatial Photos & Videos",
			    "Faster Charging (up to 45W wired, 25W MagSafe)",
			    "Wi-Fi 7 Support",
			    "Macro Photography for All Models"
			};
		switch(user_choice.toLowerCase()) {
		case "yes":
			System.out.println("***iPhone16 Features***");
			for(int i=0;i<iPhone16Features.length;i++) {
				System.out.println(iPhone16Features[i]);
				
			}
			break;
		case "no":
			System.out.println("Ok, Thank you...");
			
		}
		
	}

}
