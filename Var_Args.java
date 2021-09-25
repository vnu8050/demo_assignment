package demo;

public class Var_Args {
	
	public static void main(String[] args) {
		int a=1,b=2,c=3,d=4;
		sum(a,b,c,d,5,6,7,8,9,10);
		
	}
	public static void sum(int a, int b, int...c) {
		int sum=a+b;
		for (int i=0; i<c.length;i++) {
		
			sum +=c[i];
		}
	System.out.println("The addition of all given numbers is :" +sum);
	}

}
