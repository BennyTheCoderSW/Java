import java.util.Scanner;

public class Faculty {
    
static boolean yes = true;



public static void facultyTenured() {

Scanner input = new Scanner(System.in);
System.out.println("Is this Faculty member tenured?");
yes = input.nextBoolean();
if(yes == true)
System.out.println("The Faculty Member is tenured");
if(yes == false)
System.out.println("The Faculty Member is not tenured");

}
}
