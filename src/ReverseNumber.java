import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int i11=0;
		int remainder;
		int rev_num=0;
	System.out.println("Enter the number");
	Scanner sc= new Scanner(System.in);
	 i11=sc.nextInt(); 
	while(i11!=0) {
	  remainder= i11%10; 
	  rev_num=rev_num*10+remainder;
	  i11=i11/10; 
	}
	  System.out.println(rev_num);
	
//	System.out.println(i1%10);
//	System.out.println(i1/10);
	
	}

}
