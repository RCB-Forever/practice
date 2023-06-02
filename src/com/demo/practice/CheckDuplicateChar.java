package com.demo.practice;

import java.util.Scanner;
import java.util.*;

public class CheckDuplicateChar {

	private static boolean checkDuplicateChar(String password) {
		char[] c1 = password.toCharArray();
		List<String>  chactersList = new ArrayList<>();
		for (int i = 1; i < c1.length; i++) {
			chactersList.add(c1[i] + "");
		}
		Set<String> sortCharacters = new TreeSet<>(chactersList);
		for (String c : sortCharacters) {
			if (Collections.frequency(chactersList, c) > 1) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass = sc.nextLine();
		boolean isDuplicate=checkDuplicateChar(pass);
		System.out.println(isDuplicate);
	}
}
