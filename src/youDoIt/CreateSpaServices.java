package youDoIt;

import java.util.Scanner;

public class CreateSpaServices {
	// Somewhere between 140 & 166 there are services needed for this to work
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstService = getData(firstService);
		secondService = getData(secondService);
	}
	public static SpaService getData(SpaService s)
	{
		String service;
		double price;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Emter service  >> ");
		service = keyboard.nextLine();
		System.out.print("Enter price >> ");
		price = keyboard.nextDouble();
		keyboard.nextLine();
		s.setServiceDescription(service);
		s.setPrice(price);
		return s;
	}

}
