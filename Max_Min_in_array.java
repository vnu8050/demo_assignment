package demo;

public class Max_Min_in_array {
	
	public static void main(String[] args) {
		
	
	int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
	int[] arr = {18,16,31,7,99,12,78,34,11,13,44};
	
	for(int i=0;i<arr.length;i++ ) {
	if(arr[i]>max) {
		max=arr[i];
	}
		}
	for(int j=0;j<arr.length;j++) {
	if(arr[j]<min) {
		min=arr[j];
	}
		
	}
	System.out.println("The maximun number is : "+max);
	System.out.println("The minimun number is : "+min);

	}
}
