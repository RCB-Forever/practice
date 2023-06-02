package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {

		ArrayList<Integer> i1=new ArrayList<Integer>();
		i1.add(0);
		i1.add(15);
		i1.add(10);
		i1.add(6);
		i1.add(3);
		i1.add(2);
		i1.add(34);
		i1.add(14);
		i1.add(90);
		
		System.out.println(i1);
		
//		Collections.sort(i1);
		
		System.out.println(i1);
		
		List<Integer> l1 = null;
//		l1=i1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(l1);
	}

}
