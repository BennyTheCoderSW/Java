package Week2Java2;

import java.util.Scanner;

public class FootballGame {
    
static String t1 = "Lightning";
static String t2 = "Turtles";

static int s1;
static int s2;

static int q1l;
static int q1t;
static int q2l;
static int q2t;
static int q3l;
static int q3t;
static int q4l;
static int q4t;





public static void main(String[] args) {
    
    introduction();

    firstQuarter();

    secondQuarter();

    thirdQuarter();

    lastQuarter();


}

public static void lastQuarter() {
    System.out.println("Last Quarter!");
    getS1();
    getS2();
    System.out.println(t1 + " Score is below");
    q4l = setS1(s1);
    System.out.println(q4l);
    System.out.println(t2 + "Score is below");
    q4t = setS2(s2);
    System.out.println(q4t);
    System.out.println("That ends the last quarter");
    System.out.println("The final scores are below!");
    System.out.println("Lightning score: " + (q1l + q2l) + (q3l + q4l));
    System.out.println("Turtles score: " + (q1t + q2t) + (q3t + q4t));
}

public static void thirdQuarter() {
    System.out.println("Next Quarter!");
    getS1();
    getS2();
    System.out.println("That ends the third quarter");
    System.out.println(t1 + " Score is below");
    q3l = setS1(s1);
    System.out.println(q3l);
    System.out.println(t2 + "Score is below");
    q3t = setS2(s2);
    System.out.println(q3t);

}

public static void secondQuarter() {
    System.out.println("Next Quarter!");
    getS1();
    getS2();
    System.out.println("That ends the second quarter");
    System.out.println(t1 + " Score is below");
    q2l = setS1(s1);
    System.out.println(q2l);
    System.out.println(t2 + "Score is below");
    q2t = setS2(s2);
    System.out.println(q2t);

}

public static void firstQuarter() {
    System.out.println("Lets Begin our Game!");
    System.out.println("=====================");
    getS1();
    getS2();
    System.out.println("That ends the first quarter");
    System.out.println(t1 + " Score is below");
    q1l = setS1(s1);
    System.out.println(q1l);
    System.out.println(t2 + "Score is below");
    q1t = setS2(s2);
    System.out.println(q1t);

}

public static void introduction() {
    System.out.println("Welcome to the Football Game!");
    System.out.println("Tonight we have the following teams playing!");
    getT1();
    getT2();
}

public static String getT1() {
    return t1;
}
public static String getT2() {
    return t2;
}
public void setT1(String t1) {
    this.t1 = t1;
}
public void setT2(String t2) {
    this.t2 = t2;
}
public static int getS1() {
    Scanner score = new Scanner(System.in);
    System.out.println("Please enter a score ");
    return s1 = score.nextInt();
}
public static int getS2() {
    Scanner score = new Scanner(System.in);
    System.out.println("Please enter a score ");
    return s2 = score.nextInt();
}
public static int setS1(int s1) {
    return s1;
}
public static int setS2(int s2) {
    return s2;
}






}
