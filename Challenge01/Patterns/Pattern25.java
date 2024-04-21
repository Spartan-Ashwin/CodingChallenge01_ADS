package Patterns;

import java.util.Scanner;

public class Pattern25 {
	
//	1 2 3 4 5 6 7
//	2 3 4 5 6 7 1
//	3 4 5 6 7 1 2
//	4 5 6 7 1 2 3
//	5 6 7 1 2 3 4
//	6 7 1 2 3 4 5
//	7 1 2 3 4 5 6

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int k=i;
			for(int j=1;j<=n;j++) {
				
				if(k>n) {
					k=1;
				}
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		

	}

}

