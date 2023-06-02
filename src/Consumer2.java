import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class Consumer2 {
	public static void main(String[] args) {

		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"Mallikarjun"));
		emp.add(new Employee(2,"Mallikarjun"));
		emp.add(new Employee(3,"Mallikarjun"));
		emp.add(new Employee(4,"Mallikarjun"));
		emp.add(new Employee(5,"Mallikarjun"));
		emp.add(new Employee(6,"Mallikarjun"));
		emp.add(new Employee(7,"Mallikarjun"));
		emp.add(new Employee(8,"Mallikarjun"));
		emp.add(new Employee(9,"Mallikarjun"));
		emp.add(new Employee(11,"Mallikarjun"));
		emp.add(new Employee(12,"Mallikarjun"));
		emp.add(new Employee(13,"Mallikarjun"));
		
		Consumer<Employee> em=m -> {
			System.out.println("Employee Id" + m.empId);
			System.out.println("Employee Id" + m.empName);
		};
		
		emp.forEach(em);
//		for(Employee emps:emp) {
//			em.accept(emps);
//		}
		

	}
}

class Employee{
	
	int empId;
	String empName;
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	public Employee() {
		super();
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	
}