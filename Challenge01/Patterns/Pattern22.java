package Patterns;

import java.util.Scanner;

public class Pattern22 {
	
//	1111111
//	1111122
//	1111333
//	1114444
//	1155555
//	1666666
//	7777777 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(1);
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
