package com.demo.practice;

class ParentTest {
	String parentName;

	ParentTest(String n1) {
		parentName = n1;
	}

	public void display() {
		System.out.println(parentName);
	}
}

class ChildTest extends ParentTest {
	String childName;

	ChildTest(String n2) {
		super(n2);
		childName = n2;
	}

	public void display() {
		System.out.println(childName);
	}
}

class Test5 {
	public static void main(String args[]) {
		ChildTest ct1 = new ChildTest("Jai");
		ParentTest pt1 = new ParentTest("Adithya");
		System.out.println(pt1 = ct1);
		pt1.display();

		ParentTest pt2 = new ParentTest("Sai");
		ChildTest ct2 = (ChildTest) pt2;
	}
}
