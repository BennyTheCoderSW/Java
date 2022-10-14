package Week3;

public class NumbersDemo {

	public static void main(String[] args) {
		displayTwicetheNumber();
		displayNumberPlusFive();
		displayNumberSquared();

	}
	public static void displayTwicetheNumber() {
		int a = 7;
		int b = 3;	
		System.out.println("Twice the value of A is " + (a*2));
		System.out.println("Twice the value of B is " + (b*2));
	}


	public static void displayNumberPlusFive() {
		int a = 7;
		int b = 3;
		System.out.println("A plus 5 is " + (a + 5));
		System.out.println("B plus 5 is " + (b + 5));
	}

	public static void displayNumberSquared() {
		int a = 7;
		int b = 3;
		System.out.println("A squared is " + (a*a));
		System.out.println("B squared is " + (b*b));
	}

}
