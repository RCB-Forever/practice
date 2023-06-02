package com.demo.practice;

public interface ImplementMultipleInterf {
	
	default void m1() {
		
	}

}

interface secondInteref{
	default void m1() {
		
	}
}


//Duplicate default methods named m1 with the parameters () and () 
//are inherited from the types secondInteref and ImplementMultipleInterf
class Test1 implements ImplementMultipleInterf,secondInteref{

	@Override
	public void m1() {
		secondInteref.super.m1();
	}
	
}