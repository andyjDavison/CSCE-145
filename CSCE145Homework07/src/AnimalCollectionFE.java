/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class AnimalCollectionFE {

	public static Scanner keyboard;
	public static AnimalCollection aCollection;
	public static void main(String[] args) {
		printGreetings();
		boolean quit = false;
		while(!quit)
		{
			printChoices();
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			switch(choice)
			{
			case 1:
				addAnimal();
				break;
			case 2:
				removeAnimal();
				break;
			case 9:
				quit = true;
				break;
			default:
				System.out.println("Invalid Input");
			}
			aCollection.printAnimals();
		}
		
		public static void addAnimal() {
			System.out.println("Enter the name of the animal");
			String name = keyboard.nextLine();
			System.out.println("Enter the weight of the animal")
		}
		public static void removeAnimal() {
			
		}

	}

}
