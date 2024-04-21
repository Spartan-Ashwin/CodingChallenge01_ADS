package codingchallenges;

import java.util.*;

public class Pro04 {

	// 4.	Write a Java program to sort a given array list.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
		System.out.println(arr);
		
		sortArray(arr);
		System.out.println(arr);
		

	}
	
	static void sortArray(ArrayList<Integer> arr) {
		

		for(int i=0;i<arr.size()-1;i++) {
			
			for(int j=0;j<arr.size()-1-i;j++) {
				if(arr.get(j)>arr.get(j+1)) {
					int temp=arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		
		
	}

}
