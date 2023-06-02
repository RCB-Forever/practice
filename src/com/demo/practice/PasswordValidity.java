package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidity {

	public static int isValidPassword(String password) {
		if (!(password.length()>8 && password.length() < 31)) {
			return 10;
		}

		else if (!password.matches(".*[a-zA-Z0-9]{1,}.*")) {
			return 20;
		} else if (!password.matches(".*[@_]{1,}.*")) {
			return 30;
		}
		/**
		 * Pattern p = Pattern.compile("^.*[a-zA-Z0-9]+.*$"); Pattern p =
		 * Pattern.compile("/^([a-zA-Z0-9]+)$/"); Pattern p3 =
		 * Pattern.compile("^[A-Za-z0-9_]*$");
		 * 
		 * Matcher m = p3.matcher(password); boolean res = m.find(); if (res ==
		 * Boolean.FALSE) { return 20; }
		 * 
		 * Pattern p1 = Pattern.compile("[^A-Za-z0-9 ]"); Matcher m1 =
		 * p1.matcher(password);
		 * 
		 * if (!(m1.find())) { return 30; }
		 */

		else if (checkDuplicateChar(password)) {
			return 40;
		}

//		boolean isDuplicate=checkDuplicateChar(password);
//		if(isDuplicate) {
//			return 40;
//		}
		return 0;
	}

	private static boolean checkDuplicateChar(String password) {
		char[] c1 = password.toCharArray();
		List<String> chactersList = new ArrayList<>();
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

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the password");
		// String pass = sc.nextLine();
		String pass = "1asaaaaaaaaaaaaaaaaaa_@";
		System.out.println(isValidPassword(pass));

	}

}
