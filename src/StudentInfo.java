import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		Predicate<Integer> p1 = p -> p > 60;

		Function<Student, String> f1 = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A+[Distinction]";
			}
			if (marks >= 60) {
				return "A[First Class]";
			}
			if (marks >= 50) {
				return "B[Second Class]";
			}
			if (marks >= 35) {
				return "C[Third Class]";
			} else {
				return "E[Failed]";
			}
		};

		Consumer<Student> cm = s -> {
			if(p1.test(s.marks)) {
			System.out.println("Student rollNo" + s.rollNo);
			System.out.println("Student name" + s.name);
			System.out.println("Student marks" + s.marks);
			System.out.println("Student grade" + f1.apply(s));
			}
		};

		l.forEach(cm);
		
	}

}

class Student {

	
	int rollNo;
	String name;
	String grade;
	int marks;

	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + ", marks=" + marks + "]";
	}

	public Student(int rollNo, String name, String grade,int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		this.marks = marks;
	}

	public Student() {
		super();
	}

}
