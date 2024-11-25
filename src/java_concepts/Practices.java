package java_concepts;
import java.util.*;
class Calculator{
	void addtion(int a,int b) {
		int sum =a+b;
		System.out.println(sum);
	}
	void substraction(int a, int b) {
		int sub = a-b;
		System.out.println(sub);
	}
}
public class Practices {
    public static void main(String[] args) {
    	Calculator cl = new Calculator();
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter value1:");
    	int value1 = in.nextInt();
    	System.out.println("Enter value2:");
    	int value2 = in.nextInt();
    	cl.addtion(value1,value2);
    	cl.substraction(value1, value2);
        
    }
}

