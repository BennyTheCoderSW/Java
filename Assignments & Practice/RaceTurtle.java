package Week2Java2;

import java.util.Scanner;


public class RaceTurtle {
    
    
    static int races;
    static int wins;

    public static void main(String[] args) {
        winsandRaces();

    }

    public static void winsandRaces() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of races your turtle has completed");
        races = input.nextInt();
        System.out.println("Please enter the number of wins your turtle has");
        wins = input.nextInt();
        System.out.println("Your turtle has completed " + races + " Races");
        System.out.println("Your turtle has " + wins + " Wins");
    }
}
