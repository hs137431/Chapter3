package youDoIt;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstNumber, secondNumber;
		firstNumber = 4;
		secondNumber =12;
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
