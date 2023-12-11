/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println("What is your name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("Greetings "+name);
		
		System.out.println("How many cats do you have?");
		int cats = keyboard.nextInt();
		System.out.println("How does one live with "+cats+" cats?");
		
		//1.Java virtual machine
		//2.Byte Code
		//3.Syntax, Run-time, Logic
	}

}
