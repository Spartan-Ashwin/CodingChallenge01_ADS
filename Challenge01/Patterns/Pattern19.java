package Patterns;

import java.util.Scanner;

public class Pattern19 {
	
//	1
//	1 2 1
//	1 2 3 2 1
//	1 2 3 4 3 2 1
//	1 2 3 4 5 4 3 2 1
//	1 2 3 4 5 6 5 4 3 2 1
//	1 2 3 4 5 6 7 6 5 4 3 2 1  

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			int val=1;
			for(int j=1;j<=count;j++) {
				
				if(j<i) {
					System.out.print(val+" ");
					val++;
				}else {
					
					System.out.print(val+" ");
					val--;
				
				}
			}
			count+=2;
			System.out.println();
			
		}
	}
	
	
	

}
