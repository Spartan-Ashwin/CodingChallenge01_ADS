package codingchallenges;
import java.util.*;
public class Pro24 {

	// 24.	Write a Java program to check whether a map contains key-value mappings (empty) or not
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		// hm.put(1,1);
		if(hm.size()==0) {
			System.out.println("HashMap is empty..");
		}else {
			System.out.println("HashMap is not empty..");
		}
		

	}

}
