package codingchallenges;
import java.util.*;
public class Pro15 {
	
	// 15.	Write a Java program to iterate through all elements in a hash list.
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		// Way 01
		
		for(int ii: hs) {
			System.out.print(ii+" ");
		}
		
		System.out.println();
		
		// Way 02
		
		Iterator itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
	}

}
