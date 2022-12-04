import java.util.Scanner;

public class CollegeEmployee {
    
    static int ss;
    static double salary;
    static String dept;


public static void collegeData(){

Scanner input = new Scanner(System.in);
System.out.println("Enter you Social Security Number (no dashes)");
ss = input.nextInt();

System.out.println("Enter your annual salary ");
ss = input.nextInt();

System.out.println("Enter the Department you work for");
ss = input.nextInt();

}
public static void displaycollegeData() {

System.out.println(ss);
System.out.println(salary);
System.out.println(dept);

}
}