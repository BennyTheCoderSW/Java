package Week4;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
	
		try (Scanner input = new Scanner(System.in)) {
			System.out.println(" Please enter a number between one and ten. ");
			number = input.nextInt();
		}
		if (number == 2)
		System.out.println(" Your integer is even ");
		if (number == 4)
		System.out.println(" Your integer is even ");
		if (number == 6)
		System.out.println(" Your integer is even ");
		if (number == 8)
		System.out.println(" Your integer is even ");
		else
		System.out.println(" You integer is odd ");

	}

}
