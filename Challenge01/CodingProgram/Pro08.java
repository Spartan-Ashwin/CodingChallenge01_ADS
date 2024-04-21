package codingchallenges;

import java.util.Scanner;

import codingchallenges.Pro09.Node;

public class Pro08 {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	static Node head=null,tail=null;
	static int size=0;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five elements : ");
		for(int i=0;i<5;i++) {
			addElementAtLast(sc.nextInt());
		}
		printList();
		
	
		
		
	}
	
	
	
	
	static void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static void addElementAtLast(int data) {
		Node n=new Node(data);
		size++;
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
	}

}
