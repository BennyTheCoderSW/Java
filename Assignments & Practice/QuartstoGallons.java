package Week2;

import java.util.Scanner;

public class QuartstoGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		quartstoGallons(); 
	}

	private static void quartstoGallons() {
		int quartsNeeded; 
		int gallon = 4; 
				
		try (Scanner userInput = new Scanner(System.in)) {
			System.out.print("Please enter the amount of quarts needed for the job. "); 
			quartsNeeded = userInput.nextInt();
		}
		System.out.println("A job that requires " + quartsNeeded + " quarts requires " + (quartsNeeded/gallon)
				+ (" gallons of paint"));
	}

}
