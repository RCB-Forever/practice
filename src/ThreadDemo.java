import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ts=new ArrayList<Integer>();
		ts.add(100);
		ts.add(1);
		ts.add(1000);
		ts.add(10);
		ts.add(10000);
		ts.add(10);
		
		NavigableSet<Integer> N=new TreeSet<>(ts);
		System.out.println(N.tailSet(10,false));
		System.out.println(N.tailSet(10));
		System.out.println(N.higher(10));
		
		int A=N.pollFirst();
		System.out.println(N.size());
		

	}

}
