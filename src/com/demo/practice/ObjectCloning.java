package com.demo.practice;




 class Employee 
{
	String empName;
	String id;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String id) {
		super();
		this.empName = empName;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + "]";
	}
	
	protected Employee clone() throws CloneNotSupportedException
	{
		return (Employee)super.clone();
		
	}
}	
public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp=new Employee("Mallikarjun","A121");
		Employee emp2=emp.clone();
		System.out.println(emp);
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
	}

}
