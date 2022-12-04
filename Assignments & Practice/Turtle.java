package Week2Java2;

import java.util.Scanner;


//missing getters and setters
//method provides these from the user in its place

public class Turtle {
    
    static String name;
    static String color;
    static Double weight;
    static int year;

    public static void main(String[] args) {
      
        turtleInfo();

    }

    public static void turtleInfo() {
        Scanner turtle = new Scanner(System.in);
        System.out.println("Please enter your turtles name");
        name = turtle.nextLine();
        System.out.println("Please enter your turtles color");
        color = turtle.nextLine();
        System.out.println("Please enter your turtles weight");
        weight = turtle.nextDouble();
        System.out.println("Please enter your turtles birth year");
        year = turtle.nextInt();
        System.out.println("Your Turtles information is below");
        System.out.println("==================================");
        System.out.println(name);
        System.out.println("color is " + color);
        System.out.println(weight + "lbs");
        System.out.println("Born in " + year);
    }
}
