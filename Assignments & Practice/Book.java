
import java.util.Scanner;

public abstract class Book {
    
static String title;
static int pages;
static double price;

public static String getTitle() {
Scanner input = new Scanner(System.in);
System.out.println("Please enter a book title");
title = input.nextLine();
return title;
}
public static int getPages() {
Scanner input = new Scanner(System.in);
System.out.println("Please enter the number of pages of the book");
pages = input.nextInt();
    return pages;
}
public static double getPrice() {
Scanner input = new Scanner(System.in);
System.out.println("Please enter the price of your book");
price = input.nextDouble();
    return price;
}

public abstract void setPrice(double price);
}
    





