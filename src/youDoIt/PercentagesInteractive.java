package youDoIt;

import java.util.Scanner;

public class PercentagesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNumber, secondNumber;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Please enter the first number >> ");
		firstNumber = keyboard.nextDouble();
		System.out.print("Please enter the second Number >> ");
		secondNumber = keyboard.nextDouble();
		computePercent(firstNumber, secondNumber);
	}
	public static void computePercent(double X, double Y)
	{
		double answer1;
		double answer2;
		
		answer1 = X / Y * 100;
		answer2 = Y / X * 100;
		 System.out.println(String.format("%.0f%%",answer1));
		 System.out.println(String.format("%.0f%%",answer2));
	}

}
