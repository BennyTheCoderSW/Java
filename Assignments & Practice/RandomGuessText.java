package Week2;

import java.util.Scanner;

public class RandomGuessText {

	public static void main(String[] args) {
		
		randomguessText();	

	}

	private static void randomguessText() {
		final int MIN =1;
		final int MAX =5;
		
		int guess;
		int random; 
		try (Scanner userInput = new Scanner(System.in)) {
			random = MIN + (int)(Math.random() * MAX);
			
			System.out.println("============= Number Guess Game=================");
			System.out.println("Enter a number between " + MIN + " and " + MAX);
			guess = userInput.nextInt();
		}
		
		if(guess == random)
		{
			System.out.println("You are the winner!");
			System.out.println("You are a very good player!!!!");
		}	
		else
			System.out.println("Try Again!");
	}

}
