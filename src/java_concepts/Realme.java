package java_concepts;

import java.util.Scanner;

public class Realme extends Mobiles {
    static void realmeMobiles(String user_brand) {
        System.out.println("You selected " + user_brand);
        System.out.println("Do you want to explore it? yes or no?");
        Scanner scanner = new Scanner(System.in);
        String user_choice = scanner.next();

        switch (user_choice.toLowerCase()) {
            case "yes":
                System.out.println("Latest version is Realme GT5");
                System.out.println("Do you want to explore it? yes or no?");
                String user_mobile_choice = scanner.next();
                switch (user_mobile_choice.toLowerCase()) {
                    case "yes":
                        RealmeGT5.realmeGT5Features(user_choice);
                        break;
                    default:
                        System.out.println("Ok, Thank you...");
                }
                break;

            default:
                System.out.println("Ok, Thank you...");
        }
    }
}
