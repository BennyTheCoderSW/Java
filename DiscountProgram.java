package Week2;

import java.util.Scanner;

public class DiscountProgram {

	public static void main(String[] args) {
		
		try (Scanner userkeyboard = new Scanner(System.in)) {
			System.out.println("Discount Program");
			System.out.println("****************");
			System.out.println("Hello, what is your name?");
			String name = userkeyboard.nextLine();
			
			System.out.println("Hi " + name + ", what is the purchase price?");
			
			float purchasePrice = userkeyboard.nextFloat();
			
			System.out.print("What is the discount you want calculated, " + name + "?");
			
			float discountPercentage = userkeyboard.nextFloat();
			
			float discountedPrice = purchasePrice * discountPercentage;
			
			System.out.println(name + "here are your figures:");
			System.out.println("Original Price:\t" + purchasePrice); 
			System.out.println("Discount:\t" + discountPercentage + "%"); 
			System.out.println("Final Price:\t" + discountedPrice);
		}
		
		
		
		
		
	
		
		
		

	}

}
