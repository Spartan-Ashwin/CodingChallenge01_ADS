package codingchallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pro07 {
	// 7.	Write a Java program to print all the elements of a ArrayList using the position of the elements

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
		System.out.println(arr);
		System.out.println("**********************************");
		printElementWithPosition(arr);
	
		

	}
	
	static void printElementWithPosition(ArrayList<Integer>arr) {
		

			for(int i=0;i<arr.size();i++) {
				System.out.println(i+" ==> "+arr.get(i));
			}
	}








}
