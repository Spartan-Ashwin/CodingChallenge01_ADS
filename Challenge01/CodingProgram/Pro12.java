package codingchallenges;

import java.util.Scanner;

import codingchallenges.Pro11.Node;

public class Pro12 {
	
	// 12.	 Write a Java program to check if a particular element exists in a linked list.
	

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
		
		System.out.println("Enter search element : ");
		int data=sc.nextInt();
		
		searchInList(data);
		
		
	}
	
	static void searchInList(int data) {
		
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data) {
				System.out.println("Yes Element Exist..");
				return ;
			}
			temp=temp.next;
		}
		System.out.println("No Element Does Not Exist..");
	}
	
	
	
	static void printList() {
		Node temp=head;
		int pos=0;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
			pos++;
		}
		System.out.println();
	}

}
