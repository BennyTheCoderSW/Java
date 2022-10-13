package Week6;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		
		String words;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		words = input.next();		
		int length = words.length();
		int spaces = words.indexOf(" ");
		System.out.println("The number of words your sentence has is " + (length - spaces));

	}

}
