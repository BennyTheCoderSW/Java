import java.util.Scanner;

public class DistanceFromAverage {

    public static void main(String[] args) {
        


    //Allow user to enter double values up to 15 entries 
    //if user hits 99999, they should not be able to enter numbers
    //If user does not enter number, an error message should be displayed
    //display each value and its distance from the average
   
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number");
    double number;
    number = input.nextDouble();
    
        for(number = input.nextDouble();number < 99999;){
        System.out.println("Please enter a number");
        number = input.nextDouble();
        }
        if(number == 99999)
        System.out.println("You have entered the number " + number + " it is " + number/1 + " away from the average ");
    }
}
