
	import java.util.Scanner;

	public class OutputFormatting {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("================================");
			for (int i = 0; i < 3; i++) {
				String s1 = sc.next();
				int x = sc.nextInt();
				String s2 = x < 100 ? "0" + x : String.valueOf(x);
				s2 = x < 10 ? "0" + s2 : s2;
				System.out.printf("%-20s %s\n", s1, s2);
				// Complete this line

				System.out.println("================================");

			}
		}
	}



