package Patterns;

import java.util.Scanner;

public class Pattern21 {
	
//	1
//	10
//	101
//	1010
//	10101
//	101010 
//	1010101

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int val=1;
			for(int j=1;j<=i;j++) {
				
				if(val==1) {
					System.out.print(val);
					val=0;
				}else {
					System.out.print(val);
					val=1;
				}
			}
			System.out.println();
		}

	}

}
