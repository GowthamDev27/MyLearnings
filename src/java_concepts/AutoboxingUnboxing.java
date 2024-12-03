package java_concepts;

import java.util.ArrayList;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primitiveValue = 5;
		Integer objValue = primitiveValue;
		ArrayList<Integer> objList = new ArrayList<>();
//		objList.add(objValue);
		objList.add(3);
		objList.add(6);
		objList.add(2);
		objList.add(10);
		objList.add(13);
	
		
		System.out.println("Auto boxing and unboxing");
		System.out.println("Integer: "+objValue);
		System.out.println("Unboxing from array list");
		System.out.println(objList.get(0));
		System.out.println(objList.get(2));
		System.out.println(objList.get(4));
		System.out.println(objList.get(0)+objList.get(1));
		
		
		

	}

}
