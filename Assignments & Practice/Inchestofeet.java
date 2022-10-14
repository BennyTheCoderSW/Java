package Week2;

import java.util.Scanner;

public class Inchestofeet {

	public static void main(String[] args) {
		inchestoFeet();
	}

	private static void inchestoFeet() {
		int inches = 12;
				
		try (Scanner userinput = new Scanner(System.in)) {
			System.out.println(" Please enter the amount of inches you require ");
			int userAcknowledgment = userinput.nextInt();
			System.out.println( " The number of feet for the requested inches is " + (userAcknowledgment/inches));
		}
	}

}
