package codingchallenges;

import java.util.Scanner;

import codingchallenges.Pro10.Node;

public class Pro11 {
	
	// 11.	Write a Java program to display the elements and their positions in a linked list. 
	
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
		
		
	}
	
	
	
	static void printList() {
		Node temp=head;
		int pos=0;
		while(temp!=null) {
			System.out.println(temp.data+" "+pos);
			temp=temp.next;
			pos++;
		}
		System.out.println();
	}

}
