import java.util.Scanner;

public class quiz {
//Created a Quiz class that contains an array of 10 multiple-choice 
//questions to which the user was required to respond 
//with an A, B, C, or D.
//Use the “Review Questions” from end of Chapter 12

public static void main(String[] args) {

    testout();

}
public static void testout() {    
String user;
String questions[] = {};
questions[0] = "In object oriented programming terminology, an unexpected or error condition is a";
questions[1] = "All Java exceptions are?";
questions[2] = "Which of the following statements are true?";
questions[3] = "The method that ends the current application and returns control to the OS is? ";
questions[4] = "In object oriented terminology, you _______ a procedure that might not complete correctly ";
questions[5] = "A method that detects an error condition or exception __________ an exception";
questions[6] = "A try block includes all of the following elements except? ";
questions[7] = "The segment of code that handles or takes appropriate action following an exception is a _________ block";
questions[8] = "You __________ within a try block";
questions[9] = "If you include three statements in a try block and follow the block with three catch blocks, and the second statement in the try block throws an exception, then ________";

Scanner input = new Scanner(System.in);
System.out.println("Please answer the following questions with A, B, C, or D");
System.out.println("================================================================");
System.out.println(questions[0]);
user = input.nextLine();
System.out.println(questions[1]);
user = input.nextLine();
System.out.println(questions[2]);
user = input.nextLine();
System.out.println(questions[3]);
user = input.nextLine();
System.out.println(questions[4]);
user = input.nextLine();
System.out.println(questions[5]);
user = input.nextLine();
System.out.println(questions[6]);
user = input.nextLine();
System.out.println(questions[7]);
user = input.nextLine();
System.out.println(questions[8]);
user = input.nextLine();
System.out.println(questions[9]);
user = input.nextLine();

try {
    
} catch (Exception e) {
    if(user == null)
    System.out.println("Please enter A, B, C or D");
}


}
}
