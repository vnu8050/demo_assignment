package demo;

public class Repitative_element_in_array {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,8,5,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]^arr[j]) == 0) {
					System.out.println("the repitative element in array is :"+arr[i]);
				
				}
				}
			}
	}
}
