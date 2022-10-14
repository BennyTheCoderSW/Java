package Week5;

import java.util.Scanner;

public class RetirementGoal {

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
		System.out.println("You will have " + "$" + (money*years));
		
		if(years == 0 || money == 0) {
			System.out.println("Please enter another value and try again!");
			goals();
	}

}
}