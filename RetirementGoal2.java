package Week5;

import java.util.Scanner;

public class RetirementGoal2 {

	public static void main(String[] args) {

		goals();

		}
		public static void goals() {
			double years;
			double money;
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the number of years until retirement");
			years = input.nextDouble();
			System.out.println("Please enter the amount you can save per year");
			money = input.nextDouble();
			double interest = money*years*0.04;
			System.out.println("You will have " + "$" + (money*years));
			System.out.println("You will have " + "$" + (money*years) *0.04 + " money in interest");

			
			if(years == 0 || money == 0) {
				System.out.println("Please enter another value and try again!");
				goals();
		}

	}
	

}

