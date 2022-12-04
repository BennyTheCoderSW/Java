public class ArrayMethodDemo {
    

    public static void main(String[] args) {
       
        
        int[] numbers = new int[] {4,5,2,7,8,9,73,54};
        //number in regular order 
        regular(numbers);
        //numbers in reverse order 
        reverse(numbers);
        //display sum of all integers
        sum(numbers);
        //display all number higher than the average
        average(numbers);




        //number in regular order 
        //numbers in reverse order 
        //display sum of all integers
        //display all number higher than the average


    }

    public static void regular(int[] numbers) {
        System.out.println(" Numbers in regular order ");
        System.out.println("                           ");
        for (int i=0; i <numbers.length; i++)
        System.out.println(numbers[i] + "");
    }

    public static void reverse(int[] numbers) {
        System.out.println(" Numbers in reverse order ");
        System.out.println("                           ");
        for (int i= numbers.length-1;i>=0; i--)
        System.out.println(numbers[i] + " ");
    }

    public static void sum(int[] numbers) {
        System.out.println("Sum of the numbers");
        System.out.println("                           ");
        System.out.println(numbers[0] + numbers[1] + (numbers[2] + numbers[3]) + (numbers[4] + numbers[5]) + (numbers[6] + numbers[7]));
    }

    public static void average(int[] numbers) {
        System.out.println("Average of the numbers");
        System.out.println("                           ");
        System.out.println(numbers[0] + numbers[1] + (numbers[2] + numbers[3]) + (numbers[4] + numbers[5]) + (numbers[6] + numbers[7])/8);
    }
}
