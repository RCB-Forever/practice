package com.demo.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListwithLambda {


    // Function to remove duplicates from an ArrayList
    public static  ArrayList<Integer> removeDuplicates(List<Integer> l1)
    {
  
        // Create a new ArrayList
        ArrayList<Integer> newList = new ArrayList<Integer>();
  
        // Traverse through the first list
        for (Integer element : l1) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(0);
		l1.add(3);
		l1.add(10);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(3);
		l1.add(54);
		l1.add(3);
		
		Collections.sort(l1, (i1,i2) -> (i1>i2) ? -1 : (i1<i2) ? 1 :0);
		
		System.out.println(removeDuplicates(l1));
	}

}
