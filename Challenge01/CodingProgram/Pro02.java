package codingchallenges;
import java.util.*;
import java.util.Arrays;;
public class Pro02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2.	Write a Java program to insert an element into the array list at the first position.
		
		ArrayList<String> arr=new ArrayList<>(Arrays.asList("ashwin","hanuman")) ;
		
		System.out.println(arr);
		addFirst(arr,"ram");
		System.out.println(arr);
		

	}
	static void addFirst(ArrayList<String> arr,String name) {
		arr.add(0, name);
	}

}
