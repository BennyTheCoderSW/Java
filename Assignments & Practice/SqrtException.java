import java.util.Scanner;

//Write an application that throws and catches an 
//ArithmeticException
//when you attempt to take the square root of a negative value. 
//^^^^^^ First step^^^^^^^
//Prompt the user for an input value and try the Math.sqrt() 
//method on it.
//^^^^^^^^ Second step ^^^^^^^ 
//The application either displays the square root or catches the 
//thrown Exception and displays an appropriate message.
//^^^^^ Third step ^^^^^^^ 
//Save the file as SqrtException.java.
// ^^^^^^^ Final Step^^^^^^^^



public class SqrtException {
    


//Write an application that throws and catches an 
//ArithmeticException
//when you attempt to take the square root of a negative value. 
public static void main(String[] args) {
    
arithmeticException();
}
public static void arithmeticException() {

    double user;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number");
    user = input.nextDouble();
    System.out.println("Your square root is below");
    double result = Math.sqrt(user);
    try {
        System.out.println(result); 
    } catch (Exception e) {
        if(result * result != user)
        System.out.println("Please select a number thats square root is a whole number");
    }
    
}
}


