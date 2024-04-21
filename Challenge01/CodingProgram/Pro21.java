package codingchallenges;
import java.util.*;
public class Pro21 {
	
	// 21.	Write a Java program to remove all the elements from a priority queue.
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		
		System.out.println(pq.size());
		PriorityQueue<Integer> removeWalaPQ=new PriorityQueue<>();
		
		for(int ii: pq) {
			removeWalaPQ.add(ii);
		}
		
		pq.removeAll(removeWalaPQ);
		System.out.println(pq.size());
		
				
	}
	
	

}
