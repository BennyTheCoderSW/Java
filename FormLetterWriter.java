package Week3;

import java.util.Scanner;

public class FormLetterWriter {
	
	public static void main(String[] args) {
		displaySalutation();
		orderSalutation();
	}

	public static String displaySalutation() {
		String userlastName;
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println(" Please enter your last name ");
			userlastName = userInput.nextLine();
			System.out.println(" Dear Mr/Mrs. " + userlastName);
			System.out.println(" Thank you for your recent order ");
			return userlastName;
		}
	}


	public static void orderSalutation() {
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println(" Please enter your first name ");
			String firstName = userInput.nextLine();
			
			System.out.println(" Please enter your last name ");
			String lastName = userInput.nextLine();
			
			System.out.println(" Dear Mr/Mrs. " + firstName + " " + lastName);
		System.out.println(" Thank you for your recent order. It was a pleasure doing business with you! ");
		}
	}
}


