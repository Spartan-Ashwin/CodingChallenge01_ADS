package Patterns;

import java.util.Scanner;

public class Pattern06 {
	            
//	1                  
//	2 1              
//	3 2 1        
//	4 3 2 1      
//	5 4 3 2 1    
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) { // outer loop for nos. of rows
			
			int val=i;
			
			for(int j=1;j<=i;j++) {
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
			
		}
	}
}
