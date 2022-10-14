package Week2;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		String userName;
		  
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.print("Hello! What is you name?"); userName =
			userInput.nextLine();
			System.out.println("Hello " + userName + "my name is Benny");
		}
		String userFood;
		  
		try (Scanner userInput1 = new Scanner(System.in)) {
			System.out.print("What is your favorite food?"); userFood =
			userInput1.nextLine();
			System.out.println("I enjoy " + userFood + "too!");
		}
		
		
	
	}

}
