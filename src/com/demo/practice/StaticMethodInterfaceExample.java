package com.demo.practice;


// Purpose: to define generic utility methods inside interface which are required  by multiple people ,
//by default static methods were not available to implementation class

// Overriding concept is not applicable for interface static methods

//Ambiguity problem occurs in interface for same default methods present in 2 different interfaces
public interface StaticMethodInterfaceExample {

	public static void print() {
		System.out.println("Writing static method inside interface");
	}
	
	public static void main(String[] args) {
		System.out.println("interface main method is called");
		print();
	}
}

//implementation is not mandatory
 class Test implements StaticMethodInterfaceExample{
	public static void main(String[] args) {
		//we can call static method present in interface by using only interface name with . operator
		System.out.println("class main method is called");
		StaticMethodInterfaceExample.print();
	}
}
