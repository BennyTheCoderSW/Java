public class DemoSalesperson2 {
    

    public static void main(String[] args) {
        
        int[] people = new int[] {111,112,113,114,115,116,117,118,119,120};
        int[] sales = new int[] {25000,30000,35000,40000,45000,50000,55000,60000,65000,70000};

        for (int i=0; i <people.length; i++){
        System.out.println("ID Numbers");
        System.out.println(people[i] + "");
    }
        for (int i=0; i <sales.length; i++){
        System.out.println("Sales Numbers");
        System.out.println(sales[i] + "");
        }
    }
}
