import java.util.Scanner;

public class SumofEvenAndOddInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evenSum = 0;
		int oddSum = 0;
		char choice = 'y';
		for(int i=0;choice == 'y' || choice =='Y';i++) {
			int inputNumber = sc.nextInt();
			if (inputNumber % 2 == 0) {
				evenSum += inputNumber;
				inputNumber=0;
			} else {
				oddSum += inputNumber;
				inputNumber=0;
			}
			System.out.println("do you want to continue:");
			choice = sc.next().charAt(0);
		}
		System.out.println("Sum of even integer from input is" + evenSum);
		System.out.println("Sum of odd integer from input is" + oddSum);
	}

}
