/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class PBJFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to PB&J Maker!");
		boolean quit = false;
		while(!quit)
		{
			System.out.println("Enter the data for Sandwich 1:");
			PBJSandwich sandwich01 = new PBJSandwich();
			System.out.println("Top Slice: Brand Name, Calories, Bread Type");
			sandwich01.setTopSlice(new Bread(keyboard.next(), keyboard.nextInt(), keyboard.next()));//Gets all the properties for the top slice
			System.out.println("Bottom Slice: Brand Name, Calories, Bread Type");
			sandwich01.setBottomSlice(new Bread(keyboard.next(), keyboard.nextInt(), keyboard.next()));//Gets all the properties for the bottom slice
			System.out.println("PeanutButter: Brand Name, Calories, Is it crunchy? (true or false)");
			sandwich01.setPeanutButter(new PeanutButter(keyboard.next(), keyboard.nextInt(), keyboard.nextBoolean()));//Get all the properties for the PB
			System.out.println("Jelly: Brand Name, Calories, Type of Fruit");
			sandwich01.setJelly(new Jelly(keyboard.next(), keyboard.nextInt(), keyboard.next()));//Gets all the properties for the jelly
			
			System.out.println("Enter the data for Sandwich 2:");
			PBJSandwich sandwich02 = new PBJSandwich();
			System.out.println("Top Slice: Brand Name, Calories, Bread Type");
			sandwich02.setTopSlice(new Bread(keyboard.next(), keyboard.nextInt(), keyboard.next()));
			System.out.println("Bottom Slice: Brand Name, Calories, Bread Type");
			sandwich02.setBottomSlice(new Bread(keyboard.next(), keyboard.nextInt(), keyboard.next()));
			System.out.println("PeanutButter: Brand Name, Calories, Is it crunchy? (true or false)");
			sandwich02.setPeanutButter(new PeanutButter(keyboard.next(), keyboard.nextInt(), keyboard.nextBoolean()));
			System.out.println("Jelly: Brand Name, Calories, Type of Fruit");
			sandwich02.setJelly(new Jelly(keyboard.next(), keyboard.nextInt(), keyboard.next()));
			
			System.out.println(sandwich01+"\n"+sandwich02+"\n");//Print both the sandwiches with the new properties
			System.out.println("Are they the same sandwich? "+sandwich01.equals(sandwich02));
			
			System.out.println("Would you like to quit? True or false?");
			quit = !keyboard.nextBoolean();
		}
		System.out.println("Goodbye!");

	}

}
