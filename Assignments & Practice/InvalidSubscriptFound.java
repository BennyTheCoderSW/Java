import java.util.Scanner;

//Write an application named InvalidSubscriptFound in which you 
//declare and initialize an array of 10 animals.
// ========== first step ========================
//Write a try block in which you will prompt the user for an 
//integer and display the name in the requested position. 
// ========== second step =======================
//Create a catch block that catches the potential 
//ArrayIndexOutOfBoundsException
// thrown when the user enters a number that is out of range. 
// =========== third step =======================
//The catch block should also display an error message. 
//Save the file as InvalidSubscriptFound.java 
// =========== final step =======================


public class InvalidSubscriptFound {
    
//Write an application named InvalidSubscriptFound in which you 
//declare and initialize an array of 10 animals.

public static void main(String[] args) {

String[] animals = new String[10];

animals[0] = "pig";
animals[1] = "cat";
animals[2] = "dog";
animals[3] = "frog";
animals[4] = "salamander";
animals[5] = "gecko";
animals[6] = "lizard";
animals[7] = "snake";
animals[8] = "spider";
animals[9] = "dingo";

String a = animals[0];
String b = animals[1];
String c = animals[2];
String d = animals[3];
String e = animals[4];
String f = animals[5];
String g = animals[6];
String h = animals[7];
String i = animals[8];
String j = animals[9];

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);
System.out.println(e);
System.out.println(f);
System.out.println(g);
System.out.println(h);
System.out.println(i);
System.out.println(j);

//Write a try block in which you will prompt the user for an 
//integer and display the name in the requested position. 

try {
    System.out.println("Please enter a number from 1 to 10");
    Scanner input = new Scanner(System.in);
    int user;
    user = input.nextInt();
    if(user == 1)
    System.out.println(a);
    if(user == 2)
    System.out.println(b);
    if(user == 3)
    System.out.println(c);
    if(user == 4)
    System.out.println(d);
    if(user == 5)
    System.out.println(e);
    if(user == 6)
    System.out.println(f);
    if(user == 7)
    System.out.println(g);
    if(user == 8)
    System.out.println(h);
    if(user == 9)
    System.out.println(i);
    if(user == 10)
    System.out.println(j);



//Create a catch block that catches the potential 
//ArrayIndexOutOfBoundsException
//thrown when the user enters a number that is out of range.     

} catch (Exception x) {
    Scanner input = new Scanner(System.in);
    int user;
    user = input.nextInt();
    if(user > 10)
    System.out.println("The number you entered is out of the range");
    System.out.println("Please try again!");
    main(args);
}
finally {


}
}
}

