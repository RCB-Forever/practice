import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class Employees {
	String name;
	Double sal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Employees(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sal);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
}	
	
public class HelloWorld {
	public static void main(String[] args) {

		List<Employees> l = new ArrayList<Employees>();
		l.add(new Employees("Mallikarjun", 10000.00));
		l.add(new Employees("Jagadeesh", 20000.00));
		l.add(new Employees("Sharath", 50000.00));
		l.add(new Employees("Rohith", 100000.00));
		l.add(new Employees("Mallikarjun", 10000.00));
		l.add(new Employees("Nagendra", 45000.00));
		l.add(new Employees("Sharath", 50000.00));

		HashSet<Employees> s1 = new HashSet<Employees>(l);

		List<Employees> list2 = new ArrayList<Employees>(s1);
		System.out.println("List after removing duplicate elements:");
		for (Employees ob : list2) {
			System.out.println(ob);
		}

	}
}