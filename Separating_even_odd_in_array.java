package demo;

public class Separating_even_odd_in_array {
	public static void main(String[] args) {
		int arr[] = {12,14,19,23,4,7,9,10};
		int even_arr[] = new int[4];
		int odd_arr[] = new int[4];
		System.out.println("Array elements before operation :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
		
		int res_arr[] = new int[even_arr.length+odd_arr.length];
		int c=0,e=0,o=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 ==0) {
				even_arr[e] = arr[i];
				e++;
			}else {
				odd_arr[o] = arr[i];
				o++;
			}
		}
		for(int i=0;i<even_arr.length;i++) {
			res_arr[i] = even_arr[i];
			c++;
	}
		for(int i=0;i<odd_arr.length;i++) {
			res_arr[c++] = odd_arr[i]; 
	}System.out.println();
		System.out.println("Array elements after operation");
		for(int i=0;i<res_arr.length;i++) {
		System.out.print(res_arr[i]+" ");
		}
}

}
