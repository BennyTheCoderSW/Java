package Week3;

import java.util.Scanner;

public class Patient {

	public static void main(String[] args) {
		defaultPatient(); 
	}

	public static void defaultPatient() {

		int age = 0;
		int idnumber = 0;
		System.out.println(" Your age is " + age); 
		System.out.println(" Your Patient ID Number is " + idnumber);
		Blooddata.defaultbloodType();	
	}

	public static void patientData() {

		try (Scanner userInput = new Scanner(System.in)) {
			{
				System.out.println(" Please enter your age ");
				Integer age = userInput.nextInt();
				System.out.println(" Please enter a 8 digit number to identify yourself ");
				Long idnumber = userInput.nextLong();
				System.out.println(" Your age is " + age);
				System.out.println(" Your Patient ID Number is " + idnumber);
				Blooddata.bloodType();

			}
		}
	}
}