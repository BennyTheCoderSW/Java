package Week1;

import java.util.Scanner;

public class Usergreeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program that asks for the user's name and then say hello "userName"
		 */

		
		String userName;
		  
		Scanner userInput = new Scanner(System.in);
		System.out.print("Hello! What is you name?"); userName =
		userInput.nextLine();
		  
		System.out.println("Hello" + userName + "!");
		 
		// ask what year the user was born
		// calculate the users age

		// Scanner userInput = new Scanner(System.in);
		System.out.print("What year were you born?");
		int birthyear = userInput.nextInt();

		System.out.println("I was born in " + birthyear + "!");
		userInput.close();
		
		int userage = 2022 - birthyear; 
		System.out.println("you are " + userage + " years old!"); 
	}

}
