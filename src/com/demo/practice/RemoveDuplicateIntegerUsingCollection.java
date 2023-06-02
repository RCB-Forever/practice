package com.demo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicateIntegerUsingCollection {

	public static void main(String[] args) {
		
		//Imperative Approach 1
		List<Integer> l1 = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 2, 4, 9);
		
//		Set<Integer> s1 =new HashSet<Integer>(l1); 
		Set<Integer> s1 =new TreeSet<Integer>(l1);   //throws null pointer if list contains null value
		
		for(Integer s:s1) {
			System.out.println(s);
		}
		
		//Imperative Approach 2
		
		List<Integer> uniqueList=new ArrayList<Integer>();
		
		for(Integer i:l1) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		
		System.out.println(uniqueList);
		
		//Declarative approach
		
		System.out.println(l1.stream().distinct().collect(Collectors.toList()));
		
	}
	
	

}
