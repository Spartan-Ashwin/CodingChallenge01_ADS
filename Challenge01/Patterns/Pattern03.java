package Patterns;

import java.util.Scanner;

public class Pattern03 {
	
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			
			
			for(int k=1;k<=i;k++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			
		}
	}

}
