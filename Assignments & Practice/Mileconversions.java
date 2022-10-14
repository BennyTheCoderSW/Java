package Week2;

import java.util.Scanner;

public class Mileconversions {

	public static void main(String[] args) {
				
		long yards = 1760;
		yards(yards);

	}

	private static void yards(double yards) {
		long miles;
		try (Scanner inputMiles = new Scanner(System.in)) {
		System.out.println(" Please type the amount of yards you will be traveling ");
		miles = inputMiles.nextLong();
		System.out.println(" You will travel " + (miles/yards) + (" Miles "));
		feet();
		}
	}
		
	private static void feet() {
		long miles;
		long feet = 5280;
		try (Scanner inputMiles = new Scanner(System.in)) {
		System.out.println(" Please type the amount of feet you will be traveling ");
		miles = inputMiles.nextLong();
		System.out.println(" You will travel " + (miles/feet) + (" Miles "));
		inches();
		}
	}

	private static void inches() {
		long miles;
		long inches = 63360;
		try (Scanner inputMiles = new Scanner(System.in)) {
		System.out.println(" Please type the amount of inches you will be traveling ");
		miles = inputMiles.nextLong();
		System.out.println(" You will travel " + (miles/inches) + (" Miles "));
		}
	}
}
