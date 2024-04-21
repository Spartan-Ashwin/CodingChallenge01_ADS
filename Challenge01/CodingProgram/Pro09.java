package codingchallenges;
import java.util.*;
public class Pro09 {
	
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
			addElement(sc.nextInt());
		}
		printList();
		System.out.println("Enter The Element at Specific Index : ");
		System.out.println("Enter Index Element : ");
		int index=sc.nextInt();
		System.out.println("Enter Elemnt : ");
		int data=sc.nextInt();
		insertAtIndex(index,data);
		printList();
		
		
	}
	
	static void insertAtIndex(int idx,int data) {
		
		if(idx>size || idx<0) {
			System.out.println("Invalid Index...");
			return;
		}
		Node n=new Node(data);
		if(idx==0) {
			n.next=head;
			head=n;
			return ;
		}
		if(idx==size) {
			tail.next=n;
			tail=n;
			return;
		}
		Node temp=head;
		Node pre=null;
		int pos=-1;
		while(pos<idx) {
			pos++;
			pre=temp;
			pos++;
			temp=temp.next;
		}
		
		pre.next=n;
		n.next=temp;
	}
	static void printList() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	static void addElement(int data) {
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
