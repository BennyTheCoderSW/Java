package Week3;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		
		messagetoStudent();
		
	}
		
		
	public static void gpatoMoney() {
		
	Scanner student = new Scanner(System.in);
	System.out.println("Please enter your name");
	String studentName = student.next();
	System.out.println("Please enter your GPA");
	double studentGPA = student.nextDouble();
	System.out.println(studentName + " You will receive " + "$ " + (studentGPA*10));
	}
	
	public static void messagetoStudent() {
	gpatoMoney();
	System.out.println("Thank you for your hard work and dedication");
	}
}


	
		
		
		
		
	

	


