package java_concepts;
import java.util.*;

// Abstraction
abstract class Calculator{
	void addtion(int a,int b) {
		int sum =a+b;
		System.out.println(sum);
	}
	void substraction(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
	}
}
class Multiplication extends Calculator{
	void multiplication() {
		
	}
}
public class Practices {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	Multiplication multiplication=new Multiplication();
    	System.out.println("Enter value1:");
    	int value1 = scanner.nextInt();
    	System.out.println("Enter value2:");
    	int value2 = scanner.nextInt();
    	multiplication.addtion(value1,value2);
    	multiplication.substraction(value1, value2);
        
    }
}

