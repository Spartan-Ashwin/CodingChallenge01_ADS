package codingchallenges;

import java.util.Scanner;

import codingchallenges.Pro09.Node;

public class Pro10 {
	
	//10.	Write a Java program to insert elements into the linked list at the first and last position.


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
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node n6=new Node(60);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		head=n1;
		tail=n6;
		
		printList();
		
		System.out.println("Enter Element to add at First : ");
		int data=sc.nextInt();
		
		addFirst(data);
		
		printList();
		
		System.out.println("Enter Element to add at Last : ");
		 data=sc.nextInt();
		
		addLast(data);
		printList();
		
	}
	
	static void addLast(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			tail.next=n;
			tail=n;
		}
	}
	
	static void addFirst(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}else {
			n.next=head;
			head=n;
		}
	}
	
	static void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}


}
