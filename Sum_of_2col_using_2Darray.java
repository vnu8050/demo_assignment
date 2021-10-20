package demo;

public class Sum_of_2col_using_2Darray {
	public static void main(String[] args) {
		int[][] mat = {{1,0,1},{2,1,3},{2,3,5}};
		int flag = 0;
	int sum = 0;
		for(int i=0;i<mat.length;i++) {
				sum = mat[i][0] + mat[i][1];
				
				if(sum == mat[i][2]) {
					flag = 1;
				}
				else {
					flag = 0;
					break;
				}
		
		}
		if(flag == 1) {
		System.out.println("true (equal)");	
		 }
		else {
				System.out.println("false (not equal) ");
			
		 }
	}

}
