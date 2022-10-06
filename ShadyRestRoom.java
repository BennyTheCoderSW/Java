package Week4;

import java.util.Scanner;

public class ShadyRestRoom {

	public static void main(String[] args) {
		
		int selection;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Shady Rest Hotel");
		System.out.println("Please choose from the following options!");
		System.out.println("1 for Queen Sized Bed");
		System.out.println("2 for King Sized Bed");
		System.out.println("3 for King Sized Bed & Pullout Couch");
		selection = input.nextInt();
		if (selection == 1)
		System.out.println("Your Queen Sized Bed will be $125");
		if (selection == 2)
		System.out.println("Your King Sized Bed will be $139");
		if (selection == 3)
		System.out.println("Your King Sized Bed & Pullout Couch will be $165");
		else
		System.out.println("You Have entered an Invalid Selection Your price is $0 Please Try Again.");


	}

}
