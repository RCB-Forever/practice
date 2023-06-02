import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String word=sc.nextLine();
		String[] splittedWord=word.split(" ");
		String reversedWord="";
		for(int i=splittedWord.length-1;i>=0;i--) {
			reversedWord=reversedWord.trim() + " " + splittedWord[i];
		}
		System.out.println(reversedWord);
	}

}
