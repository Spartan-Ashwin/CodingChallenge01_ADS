package codingchallenges;

import java.util.Scanner;

import codingchallenges.Pro08.Node;

public class Pro13 {
	
	// 13.	 Write a Java program to compare two linked lists.
	
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	static Node head1=null,tail1=null,head2=null,tail2=null;
	static int size1=0,size2=0;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five elements of List 1 : ");
		for(int i=0;i<5;i++) {
			addElementOfList1(sc.nextInt());
		}
		System.out.println("Enter five elements of List 2 : ");
		for(int i=0;i<5;i++) {
			addElementOfList2(sc.nextInt());
		}
		System.out.println("List 1 is : ");
		printList(head1);
		System.out.println("List 2 is : ");
		printList(head2);
		
		compareTwoList();
		
	
		
		
	}
	
	static void compareTwoList() {
		Node temp1=head1;
		Node temp2=head2;
		while(temp1!=null && temp2!=null) {
			
			if(temp1.data!=temp2.data) {
				System.out.println("List are not equal..");
				return;
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		if(temp1!=null || temp2!=null) {
			System.out.println("List are not equal..");
			return;
		}
		System.out.println("Hurrey, List are equal..");
	}
	
	
	
	
	static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static void addElementOfList1(int data) {
		Node n=new Node(data);
		if(head1==null) {
			head1=n;
			tail1=n;
		}else {
			tail1.next=n;
			tail1=n;
		}
	}
	
	static void addElementOfList2(int data) {
		Node n=new Node(data);
		if(head2==null) {
			head2=n;
			tail2=n;
		}else {
			tail2.next=n;
			tail2=n;
		}
	}

}
