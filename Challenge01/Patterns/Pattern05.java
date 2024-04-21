package Patterns;

import java.util.Scanner;

public class Pattern05 {
	
//	    1 
//	   212
//	  32123
//	 4321234
//	  32123
//	   212
//	    1
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>i;j--) {
				System.out.print("  ");
			}
			int val=i;
			boolean flag=true;
			for(int k=1;k<=count;k++) {
				
				System.out.print(val+" ");
				if(flag) {
					val--;
				}else {
					val++;
				}
				if(val<1) {
					flag=false;
					val++;
					val++;
				}
				
			}
			count+=2;
			System.out.println();
		}
		count-=4;
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			int val=n-i;
			boolean flag=true;
			for(int k=1;k<=count;k++) {
				System.out.print(val+" ");
				if(flag) {
					val--;
				}else {
					val++;
				}
				if(val<1) {
					flag=false;
					val++;
					val++;
				}
				
			}
			System.out.println();
			count-=2;
		}
	}

}
