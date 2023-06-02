package com.demo.practice;

import java.util.stream.IntStream;

public class SumOf100 {

	public static void main(String[] args) {
		
		// Imperative style of programming
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers from 0 to 100 using imperative approach is " + sum);
		
		
		//Declarative style of programming
		int sum1=IntStream.rangeClosed(0, 100).sum();
		
		System.out.println("Sum of numbers from 0 to 100 using declarative approach is " + sum1);
	}

}
