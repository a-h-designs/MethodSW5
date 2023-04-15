// Workbook methods, Q.10
// import scanner
import java.util.Scanner;

public class MyCalculator {

    //create a method to add two numbers
    //create a method to subtract two numbers
    //create a method to multiply two numbers
    //create a method to divide two numbers
    static int addMethod(int x, int y) {
        return x+y;
    }

    static int subtractMethod(int x, int y) {
        return x-y;
    }

    static int multiplyMethod(int x, int y) {
        return x*y;
    }

    static double divideMethod(int x, int y) {
        return (double) x/y;
    }

    // main method
    public static void main(String[] args) {
        System.out.println("       ----- Simple Calculator -----\nEnter 2 numbers and let me work out the answers.\n");
        // create scanner object
        Scanner sc = new Scanner(System.in);
        // ask user to enter the first number, create integer variable num1 to read this input
        System.out.println("Enter your first number:");
        int x = sc.nextInt();
        // ask user to enter second number, create integer variable num2 to read this input
        System.out.println("Enter your second number:");
        int y = sc.nextInt();
        // method calls to add, subtract, multiply and divide the numbers, print the result
        System.out.println("Results:");
        System.out.println(x + " + " + y + " = " + addMethod(x, y));
        System.out.println(x + " - " + y + " = " + subtractMethod(x, y));
        System.out.println(x + " * " + y + " = " + multiplyMethod(x, y));
        System.out.println(x + " / " + y + " = " + divideMethod(x, y));
    }
}