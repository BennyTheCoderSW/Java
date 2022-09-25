package Week3;

// This application displays some math 

public class DebugThree2
{
   public static void main(String args[])
   {
      add();
      add();
      subtract();            
   }
   public static void add()
   {
	  int a = 2, b = 5;
      System.out.println("The sum of " + "a + b" + " is" + (a + b));
   }
   public static void subtract()
   {
	  int a = 2, b = 5;
      System.out.println("The difference between " + " a and b " + " is"  + (a - b));
   }
}
