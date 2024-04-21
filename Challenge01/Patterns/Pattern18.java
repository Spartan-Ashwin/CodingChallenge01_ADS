package Patterns;

import java.util.Scanner;

public class Pattern18 {
	
//	7
//	7 6 
//	7 6 5
//	7 6 5 4
//	7 6 5 4 3
//	7 6 5 4 3 2 
//	7 6 5 4 3 2 1
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int val=n;
			for(int j=1;j<=i;j++) {
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
		}
     

	}


}
