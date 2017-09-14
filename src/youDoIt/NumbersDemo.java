package youDoIt;
import java.util.Scanner;
public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int FirstNumber = 12;
		int SecondNumber = 7;
		/*Scanner keyboard = new Scanner(System.in);
		*System.out.print("Please enter your first number >> ");
		*FirstNumber = keyboard.nextInt();
		*System.out.print("Please enter your second number >> ");
		*SecondNumber = keyboard.nextInt();
		*/
		displayTwiceTheNumber(FirstNumber, SecondNumber);
		displayNumberPlusFive(FirstNumber, SecondNumber);
		displayNumberSquared(FirstNumber, SecondNumber);
		
		
	}
	public static void displayTwiceTheNumber(int X, int Y)
	{
		int FirstTimesTwo;
		int SecondTimesTwo;
		FirstTimesTwo = X * 2;
		SecondTimesTwo = Y * 2;
		System.out.println("The first number doubled = " + FirstTimesTwo);
		System.out.println("The second number doubled = " + SecondTimesTwo);
	}
	public static void displayNumberPlusFive(int X, int Y)
	{
		int FirstPlusFive, SecondPlusFive;
		FirstPlusFive = X + 5;
		SecondPlusFive = Y + 5;
		System.out.println("The first number + 5 = " + FirstPlusFive);
		System.out.println("The second number + 5 = " + SecondPlusFive);
		
	}
	public static void displayNumberSquared(int X, int Y)
	{
		int squareSecond = (int) Math.pow(Y, 2);
		int square = (int) Math.pow(X, 2);
		System.out.println("The first number squared = " + square);
		System.out.println("The second number squared = " + squareSecond);
	}
}
