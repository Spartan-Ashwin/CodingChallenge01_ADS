package codingchallenges;
import java.util.*;

public class Pro22 {
	
	// 22.	 Write a Java program to count the number of key-value (size) mappings in a map

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"ashwin");
		hm.put(2,"shelke");
		hm.put(3,"cdac");
		
		int count=0;
		for(int ii: hm.keySet()) {
			count++;
		}
		System.out.println("size of hashset : "+count);

	}

}
