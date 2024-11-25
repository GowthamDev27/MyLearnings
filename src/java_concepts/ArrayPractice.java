package java_concepts;

import java.util.Scanner;

class PracticeArray{
	Scanner in = new Scanner(System.in);
	void arrayList(int arrSize1,int arrSize2) {
		int arr[][]=new int[arrSize1][arrSize2];
		System.out.println("Enter the elements of the array:");
		
		for (int i = 0;i<arrSize1;i++) {
			for(int j =0;j<arrSize2;j++) {
				arr[i][j]=in.nextInt();
				
			}
			
		}
		System.out.println("2D ARRAY\n");

		for (int i = 0;i<arrSize1;i++) {
			for(int j =0;j<arrSize2;j++) {
				System.out.println(arr[i][j]);
				
			}
			
		}
		
	}
}

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array 1:");
		int size_of_array1 = in.nextInt();
		System.out.println("Enter the size of the array 2:");
		int size_of_array2 = in.nextInt();
		PracticeArray al = new PracticeArray();
		al.arrayList(size_of_array1,size_of_array2);
		

	}

}
