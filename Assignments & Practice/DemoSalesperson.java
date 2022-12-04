public class DemoSalesperson {
    

    public static void main(String[] args) {
        
        int[] people = new int[] {9999,9999,9999,9999,9999,9999,9999,9999,9999,9999};
        int[] sales = new int[] {0,0,0,0,0,0,0,0,0,0};

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
