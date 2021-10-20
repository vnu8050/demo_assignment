package demo;

public class Diagonal_Matrix_Using_2D_array {
	public static void main(String[] args) {
		int[][] mat = {{2,0,0},{0,3,0},{0,0,2}};
	
		int flag = 0;
	
			
				if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) {
					flag = 1;
					
				}else {
					flag = 0;
					
				}
	
				if(flag == 1) {
		System.out.println("true (diagonal matrix)");	
		 }else {
				System.out.println("false (not diagonal matrix) ");
			
		 }
	}}
