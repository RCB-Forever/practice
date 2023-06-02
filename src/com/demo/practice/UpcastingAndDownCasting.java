package com.demo.practice;

public class UpcastingAndDownCasting {

	public static void main(String[] args) {
		SuperClass s=new SubClass();
		((SubClass) s).count();
		
		SubClass s1=new SubClass();
	}

}

class SuperClass{
	double z1=0.06;
	
	public void display() {
		System.out.println("Executing dispaly() method of super class");
	}
}

class SubClass extends SuperClass{
	public void count() {
		System.out.println("Executing count() method of sub class");
	}
}