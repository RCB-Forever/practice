package com.demo.practice;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

	public static void main(String[] args) {
		Map<Student, Integer> m1 = new HashMap<>();
		Student s1 = new Student("Mallikarjun");
		m1.put(s1, 1);
//		s1.setName("Sharan");
		System.out.println(m1.get(s1));

	}

}
