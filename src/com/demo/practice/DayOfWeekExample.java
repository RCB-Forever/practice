package com.demo.practice;

//Java Program Demonstrate getValue()
//method of DayOfWeek
import java.time.*;
import java.time.DayOfWeek;

class DayOfWeekExample {
	public static void main(String[] args)
	{
		// Set a local date whose day is found
		LocalDate localDate
			= LocalDate.of(1947,
						Month.AUGUST, 15);

		// Find the day from the local date
		DayOfWeek dayOfWeek
			= DayOfWeek.from(localDate);

		// Printing the day of the week
		// and its Int value
		System.out.println("Day of the Week on"
						+ " 15th August 1947 - "
						+ dayOfWeek.name());

		int val = dayOfWeek.getValue();

		System.out.println("Int Value of "
						+ dayOfWeek.name()
						+ " - " + val);
	}
}
