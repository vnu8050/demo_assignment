package demo;

public class Finding_num_and_index_in_array {
	
	public static void main(String[] args) {
		int[] arr = {18,16,31,7,99,12,78,34,11,13,44};
		int  num=12;
		int index=0;
		boolean flag= false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num)
			{
				flag=true;
				index=i;
				break;
			}
		}
		if(flag == true) {
			System.out.println("Number is Duplicate at = index "+index);
		
			}else
			{
				System.out.println("Number is not Duplicate");
		}

	}
}
