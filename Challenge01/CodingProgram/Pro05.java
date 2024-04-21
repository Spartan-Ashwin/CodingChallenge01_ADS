package codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;

public class Pro05 {
	
	// 5.	 Write a Java program to reverse elements in a array list.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
		System.out.println(arr);
		
		reverseArray(arr);
		System.out.println(arr);
		

	}
	
	static void reverseArray(ArrayList<Integer> arr) {
		

		int i=0;
		int j=arr.size()-1;
		while(i<j) {
			int temp=arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j,temp);
			i++;
			j--;
		}
		
		
	}

}
