package demo;

public class Merging_sorted_array {
	public static void main(String[] args) {
		int arr1[] = {4,5,6,7,8,};
		int arr2[] = {1,2,3,4};
		int c=0;
		int merge[] = new int[arr1.length+arr2.length];
		//int sort[] = new int[merge.length];
		for(int i=0;i<arr1.length;i++) {
			merge[c] = arr1[i];
			c++;
		}
		for(int i=0;i<arr2.length;i++) {
			merge[c++] = arr2[i];
		}
		System.out.println("Array after merging");
		for(int i=0;i<merge.length;i++) {
			System.out.print(merge[i]+ " ");
		}
		for(int i=0;i<merge.length;i++) {
			for(int j=i+1;j<merge.length;j++) {
				
			int temp=0;
			if(merge[i]>merge[j]) {
				
				temp=merge[i];
				merge[i]=merge[j];
				merge[j]=temp;
			}
			}
		}
		System.out.println();
		System.out.println("Array after merging and sorting is:");
		for(int i=0;i<merge.length;i++) {
			System.out.print(merge[i]+" ");
		}
	}


}
