package Week5;

import java.util.Scanner;

public class QuizScoreStatistics {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the quiz scores for your students");
		a = input.nextInt();
		System.out.println("Next quiz score");
		b = input.nextInt();
		System.out.println("Next quiz score");
		c = input.nextInt();
		System.out.println("Next quiz score");
		d = input.nextInt();
		System.out.println("Next quiz score");
		e = input.nextInt();
		System.out.println("Next quiz score");
		f = input.nextInt();
		System.out.println("Next quiz score");
		g = input.nextInt();
		System.out.println("Next quiz score");
		h = input.nextInt();
		System.out.println("Next quiz score");
		i = input.nextInt();
		System.out.println("Next quiz score");
		j = input.nextInt();
		int result = (a+b)+(c+d)+(e+f)+(g+h)+(i+j);
		System.out.println("Your average score is ");
		System.out.println(result/10);
		System.out.println("Your max value is 9");
		System.out.println("Your lowest value is 1");
		
		
		
		if(result == 99)
			System.out.println("Your average score is ");
			System.out.println(result/10);
			System.out.println("Your max value is 9");
			System.out.println("Your lowest value is 1");

		if(a < 0)
			System.out.println("Try Again!");
		if(a > 10)
			System.out.println("Try Again!");
		if(b < 0)
			System.out.println("Try Again!");
		if(b > 10)
			System.out.println("Try Again!");
		if(c < 0)
			System.out.println("Try Again!");
		if(c > 10)
			System.out.println("Try Again!");
		if(d < 0)
			System.out.println("Try Again!");
		if(d > 10)
			System.out.println("Try Again!");
		if(e < 0)
			System.out.println("Try Again!");
		if(e > 10)
			System.out.println("Try Again!");
		if(f < 0)
			System.out.println("Try Again!");
		if(f > 10)
			System.out.println("Try Again!");
		if(g < 0)
			System.out.println("Try Again!");
		if(g > 10)
			System.out.println("Try Again!");
		if(h < 0)
			System.out.println("Try Again!");
		if(h > 10)
			System.out.println("Try Again!");
		if(i < 0)
			System.out.println("Try Again!");
		if(i > 10)
			System.out.println("Try Again!");
		if(j < 0)
			System.out.println("Try Again!");
		if(j > 10)
			System.out.println("Try Again!");

	}

}
