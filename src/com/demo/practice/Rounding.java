package com.demo.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Rounding {

	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat("#.##");
//		df.setRoundingMode(RoundingMode.CEILING);
//		for (Number n : Arrays.asList(12, 123.12345, 0.23, 0.1, 2341234.212431324,9817056213435.0100)) {
//		    Double d = n.doubleValue();
//		    System.out.println(df.format(d));
//		}
		
		BigDecimal value=new BigDecimal("123x");
		System.out.println(value);
	}

}
