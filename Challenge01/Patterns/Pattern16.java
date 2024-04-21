package Patterns;

import java.util.Scanner;

public class Pattern16 {


//	    *
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 
//    * * * 
//   * * * * 
//  * * * * * 
// * * * * * * 
//* * * * * * * 
//  * * * * * 
// * * * * * * 
//* * * * * * * 
//* * * * * * * * 
//* * * * * * * * * 
//* * * * * * * 
//* * * * * * * * 
//* * * * * * * * * 
//* * * * * * * * * * 
//* * * * * * * * * * * 
//* * * * * * * * * 
//* * * * * * * * * * 
//* * * * * * * * * * * 
//* * * * * * * * * * * * 
//* * * * * * * * * * * * * 
//   * * * * 
//   * * * * 
//   * * * * 
//   * * * * 
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int space=2*n+2;
		int star=1;
		
		for(int i=1;i<=n;i++) {
			int count=star;
			for(int x=1;x<=n;x++) {
				
				for(int j=x;j<=space+1;j++) {
					System.out.print(" ");
				}
				
				for(int k=1;k<=count;k++) {
					System.out.print("* ");
				}
				count++;
				System.out.println();
			}
			space-=2;
			star+=2;
			//System.out.println();
			
			
		}
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<n;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
	

}
