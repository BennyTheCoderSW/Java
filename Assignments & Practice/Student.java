import java.util.Scanner;

public class Student {
    
static String fieldofstudy;
static double gpa;


public static void study() {

Scanner input = new Scanner(System.in);
System.out.println("What is your field of study? ");
fieldofstudy = input.nextLine();
System.out.println(fieldofstudy);
}

public static void gpa() {

    Scanner input = new Scanner(System.in);
    System.out.println("What is your GPA? ");
    gpa = input.nextDouble();
    System.out.println(gpa);

}