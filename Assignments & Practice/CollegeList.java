import java.util.ArrayList;
import java.util.Scanner;

public class CollegeList {

   static String choice; 
    

public static void userInterface() {

Scanner input = new Scanner(System.in);    
System.out.println("Please enter C for College Employee, F for Faculty, or S for Student");
choice = input.nextLine();
if(choice == "C")
System.out.println(Person.info());
System.out.println(CollegeEmployee.collegeData());
System.out.println(CollegeEmployee.displaycollegeData());




}
