package demo;

import java.util.Scanner;

public class Number_appering_once {
		
	public static void main(String[] args) {
		int arr[] =new int[5];
		System.out.println("Enter array  elements : ");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
	}sc.close();
		int temp=0;
		for(int i=0;i<arr.length;i++) {
				temp = temp^arr[i];
				}
		System.out.println("Number appered Once is "+temp);
}
}