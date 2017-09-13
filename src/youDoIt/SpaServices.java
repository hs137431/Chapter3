package youDoIt;

import java.util.Scanner;

public class SpaServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String service;
		Double price;
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter a price >> ");
		price = keyboard.nextDouble();
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		keyboard.nextLine();
		System.out.print("Enter a service >> ");
		service = keyboard.nextLine();
		System.out.print("Enter a price >> ");
		service = keyboard.nextLine();
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		System.out.println("First service details:");
			System.out.println(firstService.getServiceDescription() + " $" 
					+ firstService.getPrice());
			System.out.println("Second service details:");
			System.out.println(secondService.getServiceDescription() + " $"
					+ secondService.getPrice());
	}

}
