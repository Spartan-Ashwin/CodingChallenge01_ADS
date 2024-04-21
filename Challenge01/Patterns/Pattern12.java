package Patterns;

import java.util.Scanner;

public class Pattern12 {
	
//	     A 
//	    A B 
//	   A B C 
//	  A B C D 
//	 A B C D E 
//	A B C D E F
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int k=i;k<n;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			
			
		}
	}

}
