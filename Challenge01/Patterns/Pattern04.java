package Patterns;

import java.util.Scanner;

public class Pattern04 {
	
//       1   
//     1   1
//   1   2   1
// 1   3   3   1
//1   4   6   4   1
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=n-1;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				long val=nCr(i,k);
				System.out.print(val+" ");
				//System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	
	static long nCr(int i,int j) {
		
		long facti=factorial(i);
		long facti_j=factorial(i-j);
		long factj=factorial(j);
		
		long ans=(facti)/((factj)*(facti_j));
		return ans;
	}
	
	static long factorial(int n) {
		long ans=1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	
	

}
