package Patterns;

import java.util.Scanner;

public class Pattern09 {
	
//	1 2 3 4 5 
//	 2 3 4 5 
//	  3 4 5 
//	   4 5 
//	    5 
//	   4 5 
//	  3 4 5 
//	 2 3 4 5 
//	1 2 3 4 5
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			int val=i;
			for(int k=i;k<=n;k++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
		
		
		int count=2;
		for(int i=1;i<n;i++) {
			
			
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			int val=n-i;
			for(int k=1;k<=count;k++) {
				System.out.print(val+" ");
				val++;
			}
			count++;
			System.out.println();
			
		}
	}
	

}
