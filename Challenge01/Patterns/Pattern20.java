package Patterns;

import java.util.Scanner;

public class Pattern20 {
	
//	1234567
//	  234567
//	    34567
//	      4567
//	        567
//	          67
//	            7
//	          67
//	        567
//	      4567
//	    34567
//	  234567
//	1234567

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			int val=i;
			for(int j=i;j<=n;j++) {
				System.out.print(val);
				val++;
			}
			System.out.println();
		}
		int count=2;

		for(int i=n-1;i>=1;i--) {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			int val=i;
			for(int k=1;k<=count;k++) {
				System.out.print(val);
				val++;
			}
			System.out.println();
			count++;
			
		}

	}

}
