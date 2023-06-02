package com.demo.practice;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 4, 2, 1, 3, 5 };
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) { //for ascending order
//					if (array[j] < array[j + 1]) { //for descending order
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		for(int k=0;k<array.length;k++) {
			System.out.println(array[k]);
		}
	}

}
