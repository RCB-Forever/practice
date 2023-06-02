package com.demo.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class FindDuplicateName {

	public static void main(String[] args) {
//		List<Employees> l1 = new ArrayList<Employees>();
//		l1.add(new Employees(1, "Mallikarjun", new BigDecimal(10000)));
//		l1.add(new Employees(2, "Pramod", new BigDecimal(10000)));
//		l1.add(new Employees(3, "Sharat", new BigDecimal(100000)));
//		l1.add(new Employees(1, "Mallikarjun", new BigDecimal(10000)));
//		l1.add(new Employees(5, "Mallikarjun", new BigDecimal(10000)));
//		findDuplicateNames(l1);
		ArrayList<String> list = new ArrayList<String>();
        list.add("Sagio Mane");
        list.add("Karius");
        list.add("Mo Salah");
        list.add("Firmino");
        list.add("Lovren");
        list.add("Steven Gerrard");
        list.add("Karius");
        list.add("Mo Salah");

        Set<String> s = new HashSet<String>();

        for(String name : list) {
            if(s.add(name) == false)
                System.out.println(name + "is duplicated");
        }
	}

	private static void findDuplicateNames(List<Employees> l1) {
		List<Employees> l2 = new ArrayList<Employees>();
		for(Employees e : l1) {
			if (l2.contains(e)) {
				System.out.println(e);
			}else {
				l2.add(e);
			}
		}
	
	}

}

class Employees implements Comparable<Employees> {
	int id;
	String empName;
	BigDecimal salary;

	public Employees() {

	}

	public Employees(int id, String empName, BigDecimal salary) {
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

	@Override
	public int compareTo(Employees sal) {

		return sal.getEmpName().compareTo(this.empName);
	}

	
//	@Override
//	public int hashCode() {
//		return Objects.hash(empName, id, salary);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return Objects.equals(empName, other.empName) && id == other.id && Objects.equals(salary, other.salary);
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + "," + " empName=" + empName + ", " + "salary=" + salary + "]";
	}

}
