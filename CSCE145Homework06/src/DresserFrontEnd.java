/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class DresserFrontEnd {

	private static Scanner keyboard = new Scanner(System.in);
	private static Dresser dresser = new Dresser();
	public static void main(String[] args) {
		printGreetings();
		boolean quit = false;
		while(!quit)
		{
			printChoices();
			String choice = keyboard.nextLine();
			switch(choice)
			{
			case "add":
				addClothes();
				break;
			case "remove":
				removeClothes();
				break;
			case "quit":
				quit = true;
				break;
			default:
				System.out.println("Invalid option");
			}
			dresser.print();
		}

	}
	public static void printGreetings()
	{
		System.out.println("Welcome to Laundry Sorter");
	}
	public static void printChoices()
	{
		System.out.println("Enter \"add\" to add clothes\n"
				+ "Enter \"remove\" to remove a piece of clothing\n"
				+ "Enter \"quit\" to quit");
	}
	public static void addClothes()
	{
		System.out.println("Enter the type of clothing");
		String type = keyboard.next();
		System.out.println("Enter the color of the clothing");
		String color = keyboard.next();
		keyboard.nextLine();
		dresser.add(new Clothing(type, color));
	}
	public static void removeClothes()
	{
		System.out.println("Enter the type of clothing you want to remove");
		String type = keyboard.next();
		System.out.println("Enter the color of the clothing you want to remove");
		String color = keyboard.next();
		keyboard.nextLine();
		dresser.remove(type, color);
	}

}
