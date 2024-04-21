package Patterns;

import java.util.Scanner;

public class Pattern13 {
	
//	     A
//	    B B
//	   C   C
//	  D     D
//	 E       E
//	F         F
//	 E       E
//	  D     D
//	   C   C
//	    B B
//	     A

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		char ch='A';
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				if(k==1 || k==i) {
					System.out.print(ch+" ");
				}else {
					System.out.print("  ");
				}
			}
			ch++;
			System.out.println();
		}
		
		ch--;
		ch--;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int k=i;k<n;k++) {
				
				if(k==i || k==n-1) {
					System.out.print(ch+" ");
				}else {
					System.out.print("  ");
				}
			}
			ch--;
			System.out.println();
		}
		
	}
}
