import java.util.ArrayList;
import java.util.Scanner;

public class CarCareChoice {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cody's Car Care Shop!");
        System.out.println("                                ");
        System.out.println("We provide the following services");
        System.out.println("                                ");
        String[] service = new String[] {"oil change","tire rotation", "battery check", "brake inspection"};
        double[] price = new double[] {25,22,15,5};

        String oil = service[0] + " " + "$" + price[0];
        String tire = service[1] + " " + "$" + price[1];
        String battery = service[2] + " " + "$" +price[2];
        String brake = service[3] + " " + "$" + price[3];
        System.out.println(oil);
        System.out.println(tire);
        System.out.println(battery);
        System.out.println(brake);
        System.out.println("                                ");
        System.out.println("Please enter the first name of the service");
        String option;
        option = input.nextLine();

        if(option == service[0]){
        System.out.println(oil);
        }
        if(option == service[1]){
            System.out.println(tire);
        }
        if(option == service[2]){
            System.out.println(battery);
        }
        if(option == service[3]){
            System.out.println(brake);
        }
    }}
