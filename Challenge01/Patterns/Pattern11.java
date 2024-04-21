package Patterns;

import java.util.Scanner;

public class Pattern11 {
	
//	A B C D E F 
//	A B C D E 
//	A B C D 
//	A B C 
//	A B 
//	A 
//	A 
//	A B 
//	A B C 
//	A B C D 
//	A B C D E 
//	A B C D E F
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
		   ch='A';
			for(int j=n;j>=i;j--) {
				
			   System.out.print(ch+" ");
 		       ch++;
			}
			System.out.println();
		}
		 ch='A';
		 for(int i=1;i<=n;i++) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
		  System.out.println();
		}
	}
	

}
