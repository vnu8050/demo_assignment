package demo;

public class Duplicate_num_in_array {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,3};
	//	int num=0;
		
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			for(int j=0;j<arr.length;j++) {
				if(arr[j] == num) {
					System.out.println("Number is Duplicate");
				}
				
			}
			
		}
		
		System.out.println("Number is not Duplicate");
		
	}
	

}
