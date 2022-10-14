package Week5;

import java.util.Scanner;

public class Inbetween {

	public static void main(String[] args) {

		int a; 
		int b;

		System.out.println("Please enter a number");
		try (Scanner input = new Scanner(System.in)) {
			a = input.nextInt();
			System.out.println("Please enter a second number");
			b = input.nextInt();
		}
		for(;a<b;) {
			System.out.println(a++);
		}
		for(;b<a;) {
			System.out.println(b++);
		}
		for(;b>a;) {
			System.out.println(b--);
		}
		if(a==b)
			System.out.println("There are no integers between these numbers");

	}

}
