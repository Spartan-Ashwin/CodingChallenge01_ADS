package codingchallenges;

import java.util.*;

public class Pro03 {

	
// 3.	Write a Java program to retrieve an element (at a specified index) from a given array list.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>(Arrays.asList("ashwin","apple","bike","car","iphone"));
	
		System.out.println("Enter index : ");
		int index=sc.nextInt();
		String ans=retriveAtIndex(arr,index);
		System.out.println(ans);

	}
	
	static String retriveAtIndex (ArrayList<String> arr,int idx)
	{
		if(idx>=arr.size()) {
			return "Invalid Index";
		}
		return arr.get(idx);
	}

}
