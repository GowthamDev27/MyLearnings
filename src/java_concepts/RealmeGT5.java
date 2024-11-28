package java_concepts;

public class RealmeGT5 extends Realme {
    static void realmeGT5Features(String user_choice) {
        String[] realmeGT5Features = {
            "Snapdragon 8 Gen 2 chipset for top-notch performance",
            "144Hz AMOLED display for ultra-smooth visuals",
            "240W ultra-fast charging for a full charge in 9 minutes",
            "50MP Sony IMX890 primary camera with OIS",
            "Realme UI 5.0 based on Android 14 for a user-friendly experience"
        };

        switch (user_choice.toLowerCase()) {
            case "yes":
                System.out.println("***Realme GT5 Features***");
                for (int i = 0; i < realmeGT5Features.length; i++) {
                    System.out.println(realmeGT5Features[i]);
                }
                break;
            case "no":
                System.out.println("Would you like to go back? yes or no?");
                Realme.realmeMobiles(user_choice);
                break;
            default:
                System.out.println("Ok, Thank you...");
        }
    }
}