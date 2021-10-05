package demo;

import java.util.Scanner;

public class Average_of_array {
	   public static void main(String[] args) {
			int arr[] = new int [9];
			int sum=0;
			System.out.println("Enter array elements");
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=0;i<arr.length;i++) {
				sum = sum +arr[i];
			}
			double avg = (double) sum/arr.length;
			System.out.println("average is : "+avg);
		sc.close();
		   }

}
