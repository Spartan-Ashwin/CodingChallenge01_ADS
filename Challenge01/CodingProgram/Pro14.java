package codingchallenges;

import java.util.Scanner;

import codingchallenges.Pro08.Node;

public class Pro14 {
	
	// 14.	Write a Java program to replace an element in a linked list.
	
	
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
		System.out.println("Which element you want to replace..");
		int data=sc.nextInt();
		System.out.println("Enter the replaced value..");
		int replace=sc.nextInt();
		
		replaceWithValue(data,replace);
		printList();
		
	}
	
	static void replaceWithValue(int data,int replace) {
		
		Node temp=head;
		while(temp!=null) {
			
			if(temp.data==data) {
				temp.data=replace;
				return;
			}
			temp=temp.next;
		}
		System.out.println("Element doesn't exist ...");
		
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
