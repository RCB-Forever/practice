import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
 
class Student1 {
     private String name;
     private int age;
 
     
 
     
     

	public Student1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	public String toString() {
         return "Student[" + name + ", " + age + "]";
     }
}
 
public class Test {
     public static void main(String[] args) {
         List<Student1> students = new ArrayList<>();
         students.add(new Student1("James", 25));
         students.add(new Student1("James", 27));
         students.add(new Student1("James", 25));
         students.add(new Student1("James", 25));
 
         students.remove(new Student1("James", 25));
 
         for(Student1 stud : students) {
             System.out.println(stud);
         }
     }
}