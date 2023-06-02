package com.demo.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class daa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int num = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the elements of array");
			a.add(sc.nextInt());
		}

		System.out.println("Enter the number of queries to be executed ");
		int numOfQueries = sc.nextInt();
		for (int i = 0; i < numOfQueries; i++) {
			System.out.println("Enter the input");
			Scanner sc1 = new Scanner(System.in);
			String input = sc1.nextLine();
			if (input.equals("Insert")) {
				System.out.println("Enter the index at which element to be added");
				int inde = sc1.nextInt();
				System.out.println("Enter the value to be added");
				int val = sc1.nextInt();
				a.add(inde, val);
			} 
			if (input.equals("Delete")) {
				System.out.println("Enter the element At Index to be removed");
				int elementAtIndex = sc1.nextInt();
				a.remove(elementAtIndex);
			}
		}
		System.out.println(a);
	}
}
