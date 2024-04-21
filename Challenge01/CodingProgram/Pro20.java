package codingchallenges;

import java.util.TreeSet;

public class Pro20 {
	
//	20.	Write a Java program to find the numbers less than 7 in a tree set. 
	
	public static void main(String[] args) {
		
TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(33);
		ts.add(54);
		ts.add(1);
		ts.add(5);
		ts.add(2);
		ts.add(35);
		
		for(int ii: ts) {
			if(ii<=7) {
				System.out.print(ii+" ");
			}
		}
		
		
	}

}
