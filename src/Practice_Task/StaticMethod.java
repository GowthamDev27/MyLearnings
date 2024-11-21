package Practice_Task;

class StaticMethod{
	public static void addition(int a,int b) {
		int c = a+b;
		System.out.println("Hello, This is example for static method\n"+c);
		
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		StaticMethod.addition(2,3);
	}

}
