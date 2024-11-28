package java_concepts;

import java.util.Scanner;

// While Loop

class FactorialProgramWhileLoop{
	void Factorial(int value) {
		if (value < 0) {
            System.out.println("Factorial is not for negative numbers.");
            return;
        }
        else {
        	int result=1;
        	int i=1;
    		while (i<=value){
    			result = result*i;
    			i++;
            }
            System.out.println("While Loop Factorial value is " + result);
        }
		
	}
}

// For Loop

class FactorialProgramForLoop {
    void Factorial(int value) {
        if (value < 0) {
            System.out.println("Factorial is not for negative numbers.");
            return;
        }
        else {
        	int result = 1;

            for (int i = 1; i <= value; i++) {
                result = result * i;
            }

            System.out.println("For Loop Factorial value is " + result);
        	
        }

    }
    void switchStatements(String Employee_ID) {
    	switch(Employee_ID.toUpperCase()) {
    	case "EM001":
    		System.out.println("Employee ID: "+Employee_ID+"\nEmployee name: Gowtham");
    		break;
    	case "EM002":
    		System.out.println("Employee ID: "+Employee_ID+"\nEmployee name: Gopinath");
    		break;
    	case "EM003":
    		System.out.println("Employee ID: "+Employee_ID+"\nEmployee name: Mani");
    		break;
    	default:
    		System.out.println("Employee ID doesn't Exsist");
    	}
    	
    	
    }
}


public class LoopConcepts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("While Loop Enter the number: ");
        int input_number1 = scanner.nextInt();
        System.out.println("For Loop Enter the number: ");
        int input_number2 = scanner.nextInt();
        System.out.println("Enter employee Id\n[EM001,EM002,EM003]: ");
        String emp_ID = scanner.next();
        
        FactorialProgramWhileLoop factorialProgramWhileLoop = new FactorialProgramWhileLoop();
        factorialProgramWhileLoop.Factorial(input_number1);

        FactorialProgramForLoop factorialProgramForLoop = new FactorialProgramForLoop();
        factorialProgramForLoop.Factorial(input_number2);
        factorialProgramForLoop.switchStatements(emp_ID);
    }
}

