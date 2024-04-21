package Patterns;

import java.util.Scanner;

public class Pattern15 {
	
//	1 2 3 4 5 6 
//	 2 3 4 5 6 
//	  3 4 5 6 
//	   4 5 6 
//	    5 6 
//	     6 
	
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
		
	}

}
