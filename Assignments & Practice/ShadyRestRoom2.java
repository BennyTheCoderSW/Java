package Week4;

import java.util.Scanner;

public class ShadyRestRoom2 {

	public static void main(String[] args) {
		
		
		int selection;
		int choice;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Shady Rest Hotel");
		System.out.println("Please choose from the following options!");
		System.out.println("1 for Queen Sized Bed");
		System.out.println("2 for King Sized Bed");
		System.out.println("3 for King Sized Bed & Pullout Couch");
		selection = input.nextInt();
		if (selection == 1)
		System.out.println("Your Queen Sized Bed will be $125");
		System.out.println("Would you like the Lakeview (1) or a park view (2)?");
		choice = input.nextInt();
		if (choice == 1)
		System.out.println("Your Total is $140");
		if (choice == 2)
		System.out.println("Your Total is $125");
		if (selection == 2)
		System.out.println("Your King Sized Bed will be $139");
		System.out.println("Would you like the Lakeview (1) or a park view (2)?");
		choice = input.nextInt();
		if (choice == 1)
		System.out.println("Your Total is $154");
		if (choice == 2)
		System.out.println("Your Total is $139");
		if (selection == 3)
		System.out.println("Your King Sized Bed & Pullout Couch will be $165");
		System.out.println("Would you like the Lakeview (1) or a park view (2)?");
		choice = input.nextInt();
		if (choice == 1)
		System.out.println("Your Total is $180");
		if (choice == 2)
		System.out.println("Your Total is $165");
		else
		System.out.println("You Have entered an Invalid Selection Your price is $0 Please Try Again.");


	}

}
