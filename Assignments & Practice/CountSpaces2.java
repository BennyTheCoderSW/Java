package Week6;

import java.util.Scanner;

public class CountSpaces2 {

	public static void main(String[] args) {

		String userQuote;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a quote");
		userQuote = input.nextLine();
		System.out.println(userQuote);
		int totalspaces = userQuote.indexOf(" ");
		System.out.println(totalspaces);
	}

}
