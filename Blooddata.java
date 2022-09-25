package Week3;

import java.util.Scanner;

public class Blooddata {

	public static void main(String[] args) {

		defaultbloodType();
		bloodType();

	}	

	public static void bloodType()	{

		//	String typeO = "O";
		//	String typeA = "A";
		//	String typeB = "B";
		//	String typeAB = "AB";
		//	String positive = "+";
		//	String negative = "-";

		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println(" Please enter your blood type ");
			String bloodType = userInput.nextLine();
			System.out.println(" Please enter positive or negative ");
			String posneg = userInput.nextLine();
			System.out.println(" Your blood is " + bloodType + posneg);
		}


	}

	public static void defaultbloodType() {

		String typeO = "O";
		String positive = "+";
		System.out.println(" Your default blood type is " + typeO + positive);

	}
}



