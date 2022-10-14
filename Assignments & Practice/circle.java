package Week3;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) {

		circleDiameterRadiusArea();
	}


	public static void circleDiameterRadiusArea() {
		Scanner userInput = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Please enter the radius of the circle");
		int side23 = userInput.nextInt();
		System.out.println("Your circumference is " + (2*pi*side23));
		System.out.println("Please enter the radius of a circle");
		int side24 = userInput.nextInt();
		System.out.println("Your diameter is " + (2*side24));
		System.out.println("Your Area is " + (pi*side24*side24));
	}
}
	



