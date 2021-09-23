package demo;

public class Fibonacci {
	public static void main(String[] args) {
		
		int f=1, s=1, count=10;
		System.out.print(f+", ");
		System.out.print(s+", ");
		while(count>=0) {
			int ans=f+s;
			System.out.print(ans+", ");
			f=s;
			s=ans;
			count--;
		}
	}

}
