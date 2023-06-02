package com.demo.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetNumberofWeekDay {

	public static void main(String[] args) {

		SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
		 String dateBeforeString = "28-02-2022";
		 String dateAfterString = "12-04-2022";

		 try {
		       Date dateBefore = myFormat.parse(dateBeforeString);
		       Date dateAfter = myFormat.parse(dateAfterString);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       System.out.println("Number of Days between dates: "+daysBetween);
		       
		      int noDaya= (int) (daysBetween/7);
		      System.out.println(noDaya);
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
	}

}
