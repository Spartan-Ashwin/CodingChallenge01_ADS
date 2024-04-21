package Patterns;

import java.util.Scanner;

public class Pattern23 {
	
//	1010101
//	0101010
//	1010101
//	0101010
//	1010101
//	0101010
//	1010101

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int val=1;
			if(i%2==0) {
				val=0;
			}
			for(int j=1;j<=n;j++) {
				
				if(val==0) {
					System.out.print(val);
					val=1;
				}else {
					System.out.print(val);
					val=0;
				}
					
			}
			System.out.println();
			
			
		}

	}

}
