package Week3;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		displayTwicetheNumber2();
		displayNumberPlusFive2();
		displayNumberSquared2();
		
	}
		public static void displayTwicetheNumber2() {
			Scanner userInput = new Scanner(System.in);	
			System.out.println("Please enter the value of A");
			int a = userInput.nextInt();
			System.out.println("Twice the value of A is " + (a*2));
			System.out.println("Please enter the value of B");
			int b = userInput.nextInt();
			System.out.println("Twice the value of B is " + (b*2));
		}


		public static void displayNumberPlusFive2() {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please enter the value of A");
			int a = userInput.nextInt();
			System.out.println("A plus 5 is " + (a + 5));
			System.out.println("Please enter the value of B");
			int b = userInput.nextInt();
			System.out.println("B plus 5 is " + (b + 5));
		}

		public static void displayNumberSquared2() {
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please enter the value of A");
			int a = userInput.nextInt();
			System.out.println("A squared is " + (a*a));
			System.out.println("Please enter the value of B");
			int b = userInput.nextInt();
			System.out.println("B squared is " + (b*b));

	}

}
