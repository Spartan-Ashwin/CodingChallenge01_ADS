package codingchallenges;

import java.util.ArrayList;
import java.util.*;

public class Pro06 {
	
	//6.	Write a Java program of swap two elements in an array list.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
		System.out.println(arr);
		
		System.out.println("Enter Swap indexes : ");
		int i=sc.nextInt();
		int j=sc.nextInt();
		swapKaro(arr,i,j);
		System.out.println(arr);
		

	}
	
	static void swapKaro(ArrayList<Integer>arr,int i,int j) {
		
		if(i<arr.size() && j<arr.size()) {
			int temp=arr.get(i);
			arr.set(i, arr.get(j));
			arr.set(j, temp);
			return ;
		}
		System.out.println("Invalid Index");
	}
	


	

}
