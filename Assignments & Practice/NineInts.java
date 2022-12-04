import java.util.ArrayList;

/**
 * NineInts
 */
public class NineInts {

    public static void main(String[] args) {
        

      

       int[] numbers = new int[] {1,2,3,4,5};

        System.out.println("Original order of the Array");
        System.out.println("                           ");
        for (int i=0; i <numbers.length; i++)
        System.out.println(numbers[i] + "");
        System.out.println("Array in Reverse");
        System.out.println("                ");
        for (int i= numbers.length-1;i>=0; i--)
        System.out.println(numbers[i] + " ");

        
    }
}