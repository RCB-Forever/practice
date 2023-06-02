package com.demo.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3Sal {

	public static void main(String[] args) {
		List<EmployeeDetails> l1 = new ArrayList<>();
		l1.add(new EmployeeDetails(1, "Mallikarjun", new BigDecimal(5000)));
		l1.add(new EmployeeDetails(2, "Sharan", new BigDecimal(10000)));
		l1.add(new EmployeeDetails(3, "Pramod", new BigDecimal(8000)));
		l1.add(new EmployeeDetails(4, "Sharat", new BigDecimal(100000)));
//		List<EmployeeDetails> l2 = l1.stream().sorted().limit(3).collect(Collectors.toList());
		
		Comparator<EmployeeDetails> dateComparator = Comparator.comparing(EmployeeDetails::getEmpName)
                .thenComparing(EmployeeDetails:: getSalary);
		System.out.println(dateComparator);
		l1.sort(dateComparator.reversed());
		System.out.println(l1.stream().limit(3).collect(Collectors.toList()));
	}
}

class EmployeeDetails {
//implements Comparable<EmployeeDetails> {
	int id;
	String empName;
	BigDecimal salary;

	public EmployeeDetails() {

	}

	public EmployeeDetails(int id, String empName, BigDecimal salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

//	@Override
//	public int compareTo(EmployeeDetails sal) {
//
//		return sal.getSalary().compareTo(this.salary);
//	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ","
				+ " empName=" + empName + ", "
				+ "salary=" + salary + "]";
	}

}
