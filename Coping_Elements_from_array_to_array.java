package demo;

import java.util.Scanner;

public class Coping_Elements_from_array_to_array {
	public static void main(String[] args) {
		int arr[] = new int[7];
		int arrcpy[] = new int[7];
		System.out.println("Enter array elements");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			arrcpy[i] = arr[i];
		}
		System.out.println("Elements of 2nd array after copy");
		for(int i=0;i<arrcpy.length;i++) {
			System.out.print(arrcpy[i]);
		}
		sc.close();
	}
}
