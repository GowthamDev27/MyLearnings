package java_concepts;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first value");
		int first_value = scanner.nextInt();
		System.out.println("Enter the Second value");
		int second_value = scanner.nextInt();
		int temp = 0;
		System.out.println("Enter the No of terms");
		int tryLimit = scanner.nextInt();
		System.out.println("The fibonacci series");
		System.out.println(first_value);
		System.out.println(second_value);
		if(tryLimit > 1 ) {
			for(int i = 0; i<tryLimit;i++) {
				temp = first_value + second_value;
				first_value = second_value;
				second_value = temp;
				System.out.println(temp);
				
			}
		}
		else {
			System.out.println("Please enter Try limit no greater than 1");
		}

	}

}
