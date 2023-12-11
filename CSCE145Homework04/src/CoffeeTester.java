/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to coffee tester!");
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Enter the name and caffeine content of the first cup of coffee (Name CaffeineContent)");
			Coffee cup1 = new Coffee(keyboard.next(), keyboard.nextInt());
			System.out.println("Enter the name and caffeine content of the second cup of coffee (Name CaffieneContent)");
			Coffee cup2 = new Coffee(keyboard.next(), keyboard.nextInt());
			
			System.out.println(cup1);
			System.out.println("If you drank "+cup1.riskyAmount()+" cups of cup one you would be at risk");
			System.out.println(cup2);
			System.out.println("If you drank "+cup2.riskyAmount()+" cups of cup two you would be at risk");
			System.out.println("Are the coffees the same?\n"+cup1.equals(cup2));
			System.out.println("Type \"continue\" to continue making coffee, or type \"quit\" to quit");
			quit = keyboard.next().equalsIgnoreCase("quit");
		}
		

	}

}
