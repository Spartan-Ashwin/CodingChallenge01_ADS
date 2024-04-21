package codingchallenges;

import java.util.HashMap;

public class Pro25 {
	
	// 25.	Write a Java program to get the value of a specified key in a map
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"ashwin");
		hm.put(2,"shelke");
		hm.put(3,"cdac");
		
		System.out.println(hm.get(3));
	}


}
