package java_concepts;

import java.util.Scanner;

public class Iphone extends Mobiles {
    static void iPhoneMobiles(String user_brand) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You selected " + user_brand);
        System.out.println("Do you want to explore it? yes or no?");
        String user_choice = scanner.next();

        switch (user_choice.toLowerCase()) {
            case "yes":
                System.out.println("Latest version is iPhone 16");
                System.out.println("Do you want to explore it? yes or no?");
                String user_mobile_choice = scanner.next();
                switch (user_mobile_choice.toLowerCase()) {
                    case "yes":
                        Iphone16.iphone16Mobile(user_choice);;
                        break;
                    default:
                        System.out.println("Ok, exiting...");
                        return;
                }
                break;
            default:
                System.out.println("Ok, exiting...");
        }
    }
}
