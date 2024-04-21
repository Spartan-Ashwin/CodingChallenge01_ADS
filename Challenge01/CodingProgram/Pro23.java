package codingchallenges;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Pro23 {

	// 23.	Write a Java program to convert a priority queue to an array containing all of the elements of the queue
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		
		int[] arr=new int[pq.size()];
		int i=0;
		for(int ii: pq) {
			arr[i]=ii;
			i++;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
