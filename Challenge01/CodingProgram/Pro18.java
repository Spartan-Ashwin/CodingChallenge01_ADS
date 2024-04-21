package codingchallenges;

import java.util.HashSet;

public class Pro18 {
	
	// 18.	Write a Java program to compare two sets and retain elements which are same on both sets.
	public static void main(String[] args) {
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		
		HashSet<Integer> hs2=new HashSet<>();
		hs2.add(10);
		hs2.add(20);
		hs2.add(30);
		hs2.add(40);
		hs2.add(50);
		
		for(int ii: hs1) {
			if(!hs2.contains(ii)) {
				System.out.println("Both sets are not equal...");
				return ;
			}
		}
		System.out.println("sets are equal...");

 }
	
}
