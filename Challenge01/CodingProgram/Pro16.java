package codingchallenges;

import java.util.HashSet;

public class Pro16 {
	
	// 16.	Write a Java program to empty an hash set.
	
public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		
		System.out.println(hs.size());
		// Way 01
		
//		for(int ii: hs) {
//			System.out.print(ii+" ");       // This will give you ConcurrentModificationException
//			hs.remove(ii);
//		}
		
		// Way 02 
		
//		HashSet<Integer> removeKarneWalaHashSet=new HashSet<>();
//		
//		for(int ii: hs) {
//			removeKarneWalaHashSet.add(ii);
//		}
//		
//		hs.removeAll(removeKarneWalaHashSet);
//		System.out.println(hs.size());
		
		
		
		// Way 03
		
		hs.clear();
		System.out.println(hs.size());

}
}
