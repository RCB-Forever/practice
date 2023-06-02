import java.util.Scanner;
import java.util.function.Function;

@SuppressWarnings("unused")
public class Compose {
	static Function<String, String> f1 = s -> s.toLowerCase();
	static Function<String, String> f2 = t -> t.substring(0, 11);

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the username");
		String userName = sc.next();
		System.out.println("Enter the password");
		String password = sc.next();
		if (f1.andThen(f2).apply(userName).equals("mallikarjun")) {
			System.out.println("Valid credentials and user logged in");
		} else {
			System.out.println("InValid credentials");
		}

	}
}