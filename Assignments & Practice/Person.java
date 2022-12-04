import java.util.Scanner;

public class Person {
    

    static String fname;
    static String lname;
    static String street;
    static int zip;
    static int phone;


public static void info() {

//first name
Scanner input = new Scanner(System.in);
System.out.println("Please enter first name");
fname = input.nextLine();

//last name
System.out.println("Please enter last name");
lname = input.nextLine();

//street
System.out.println("Please enter You Street");
street = input.nextLine();

//zip
System.out.println("Please enter your zip");
zip = input.nextInt();

//phone number
System.out.println("Please enter your phone number");
phone = input.nextInt();

}
public static void display() {

System.out.println(fname);
System.out.println(lname);
System.out.println(street);
System.out.println(zip);
System.out.println(phone);







}
}
