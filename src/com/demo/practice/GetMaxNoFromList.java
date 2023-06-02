package com.demo.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GetMaxNoFromList {

	public static void main(String[] args) {

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		a1.add(12);
		a1.add(0);
		a1.add(3);
		a1.add(5);
		a1.add(23);
		a1.add(65);
		a1.add(117);
		
		Integer l1=a1.stream().min((i1,i2) -> -1).get();
		List<Integer> l=a1.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l);
		Integer l2=a1.stream().max((i1,i2) -> -i1.compareTo(i2)).get();
		
		System.out.println(l1);
		System.out.println(l2);
	}

}
