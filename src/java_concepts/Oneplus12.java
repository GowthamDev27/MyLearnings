package java_concepts;

public class Oneplus12 extends Oneplus {
    static void onePlus12Features(String user_choice) {
        String[] onePlus12Features = {
            "Snapdragon 8 Gen 3 chipset for high-end performance",
            "LTPO AMOLED 120Hz display for smooth visuals",
            "50MP primary camera with Hasselblad tuning for stunning photos",
            "5,400mAh battery with 100W fast charging",
            "OxygenOS based on Android 14 for a clean and customizable experience"
        };

        switch (user_choice.toLowerCase()) {
            case "yes":
                System.out.println("***OnePlus 12 Features***");
                for (int i = 0; i < onePlus12Features.length; i++) {
                    System.out.println(onePlus12Features[i]);
                }
                break;
            case "no":
                System.out.println("Would you like to go back? yes or no?");
                Oneplus.onePlusMobiles(user_choice);
                break;
            default:
                System.out.println("Ok, Thank you...");
        }
    }
}