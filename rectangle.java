package Week4;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args) {

		setRectangle();

	}

	public static void setRectangle() {
		{
			try (Scanner userInput = new Scanner(System.in)) {
				System.out.println(" Please enter the length of a side ");
				int side = userInput.nextInt();
				System.out.println(" Please enter the length of the second side ");
				int side2 = userInput.nextInt();
				System.out.println(" Your perimeter is " + (2*side) + (2*side2));
				System.out.println(" Your area is " + (side*side2));
			}
		}
	}
}