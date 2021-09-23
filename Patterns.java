package demo;

public class Patterns {
	public static void main(String[] args) {
		
		int n=5;
		// square
	/*	for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
		System.out.println();
		} */
			
	// Increasing triangle
	/*	for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
		System.out.println();
		} */
		
		// decreasing triangle
		/*for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
		System.out.println();
		}*/
		
		// Pyramid
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
	
			System.out.println();
		}
	}
	
	

}
