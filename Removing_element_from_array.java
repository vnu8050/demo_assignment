package demo;

public class Removing_element_from_array {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7};
		int res_arr[] = new int[arr.length-1]; 
		int k=5;
		int c=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]!=k) {
			res_arr[c] = arr[i];
			c++;
	}
	}
		System.out.println("Array elements after removing k element");
		for(int i=0;i<res_arr.length;i++) {
			System.out.print(res_arr[i]+ " ");
		}
}
}
