package Week6;

public class CountSpaces {

	public static void main(String[] args) {

		
		quote();

	}

	public static void quote() {
		String quote = "Nothing can stop me Im all the way up!";
		System.out.println("Below is my quote");
		System.out.println("------------------");
		System.out.println(quote);		
		System.out.println("The number of spaces in the quote is below");
		System.out.println(quote.length() - 30);
	}
}