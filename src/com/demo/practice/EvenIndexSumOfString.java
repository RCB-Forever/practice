package com.demo.practice;

import java.util.ArrayList;
import java.util.List;

public class EvenIndexSumOfString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("sharath");
		list.add("mohanb");
		list.add("mohanbuj");
		list.add("mohanbiopon");
		list.forEach(obj-> System.out.println(obj.length() % 2 == 0 ? obj.length():obj.length()-1 ));
		
	}

}
