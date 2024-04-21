package codingchallenges;

import java.util.Arrays;
import java.util.HashSet;

public class Pro17 {
	
	// 17.	Write a Java program to convert a hash set to an array.
	
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		int[] arr=new int[hs.size()];
		int i=0;
		for(int ii: hs) {
			arr[i]=ii;
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
