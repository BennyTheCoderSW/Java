package Week4;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {

		setSquare();
	}

	public static void setSquare() {
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.println(" Please enter the length of a side ");
			int side = userInput.nextInt();
			System.out.println(" The perimeter of the square is " + (4*side));
			System.out.println(" The Area of the square is " + (side*side));

		}

	}
}


