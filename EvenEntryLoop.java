package Week5;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		
		long even;
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please enter and even number or the sentinel value");
			even = input.nextLong();
		}
		if(even % 2 == 0) {
			System.out.println("Good Job!");
			System.out.println("Please enter another number");
		}		
			
		if(even == 999) {
				System.exit(999);
		}
		if(even % 2 != 0) {
			System.out.println("You have selected the wrong number. Please try again!");
		
		
			
	}

}
}