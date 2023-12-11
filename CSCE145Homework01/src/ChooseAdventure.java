/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
import java.util.Random;
public class ChooseAdventure {

	public static final int DRINK_RANGE = 2;//These are the ranges, non inclusive, of all the random chance endings
	public static final int CROC_RANGE = 4;
	public static final int FLINT_RANGE = 3;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Do you want to play a Game?\nIf yes type \"true\", if no type \"false\"");
		
		if(keyboard.nextLine().equalsIgnoreCase("true"))
		{
			System.out.println("WELCOME TO JUNGLE ESCAPE!\nYou have just woken up, and you are in the jungle what do you wish to do?\n\t1.Climb a tree to see where you are?\n\t2.Search for water?\n\t3.Look for shelter in a cave?");
			System.out.println("(to answer simply type the number of the option you wish to choose)");
			int choiceOne = keyboard.nextInt();
			
			if(choiceOne == 1)//if you choose to climb the tree
			{
				System.out.println("So you have chosen to climb the tree!You begin to climb...");
				System.out.println("But UH-OH! You run into a monkey whith a banana and you are mighty hungry! What do you do?\n\t1.Take the banana from the monkey?\n\t2.Ask the monkey politely for some of his banana?\n\t3.Keep climbing and forget about the monkey?");
				int choiceTwo = keyboard.nextInt();
				if(choiceTwo == 1)
				{
					System.out.println("Uh-Oh. The monkey didn't take kindly to your attmept to steal his food, and he pushes you off the tree!\nGAME OVER! BETTER LUCK NEXT TIME!");
				}
				else if(choiceTwo == 2)
				{
					System.out.println("WOW! The monkey can talk! He offers you the rest of his banana. He says there is more like him and takes you to live with them forever.\nGAME OVER!");
				
				}
				else if(choiceTwo == 3)
				{
					System.out.println("When you reach the top of the tree, you spot a city a few miles away! You're free!\nGAME OVER!");
				}
				else
				{
					System.out.println("THATS NOT A NUMBER I SAID YOU Could CHOOSE! GAME OVER! GOODBYE!");
				}
			}
			else if(choiceOne == 2)//if you choose to look for water, checks to see if you put the right number down
			{
				System.out.println("So you have chosen to venture into the jungle and search for water!\nYou look down and see a machete on the ground!");
				System.out.println("\tDo you pick it up?(type \"yes\" or \"no\")");
				String choiceTwo = keyboard.next();
				if(choiceTwo.equalsIgnoreCase("yes"))//if user puts yes, returns true no matter the case of the word
				{
					System.out.println("Good choice, now you can slash through the thick vines!");
					System.out.println("You come to a source of still water, and their is a 50% that the water is safe to drink.\nYou also see something shiny at the bottom but their is a 25% chance of crocodiles in the water.");
					System.out.println("\tDo you drink the water or jump in?(type \"drink\" or \"jump\")");
					String choiceThree = keyboard.next();
					if(choiceThree.equalsIgnoreCase("drink"))
					{
						int num = r.nextInt(DRINK_RANGE);//to make it a 50 percent chance it chooses a random number between 0 and 1
						if(num == 0)
						{
							System.out.println("Congratulations, the water was safe! You now have an unlimited supply of water!\nGAME OVER!");
						}
						else
						{
							System.out.println("Looks like the water had some nasty bacteria in it. You slowly become a zombie of your former self.\nGAME OVER! BETTER LUCK NEXT TIME!");
						}
					}
					else if(choiceThree.equalsIgnoreCase("jump"))
					{
						int num = r.nextInt(CROC_RANGE);
						if(num == 0 || num == 1)
						{
							System.out.println("Congratualtions, there were no crocodiles in the water!\nWhen you swam under you found a horde of lost gold!\nGAME OVER!");
						}
						else
						{
							System.out.println("Looks like the water was teeming with crocodiles. You become their dinner.\nGAME OVER! BETTER LUCK NEXT TIME!");
						}
					}
				
				}
				else if(choiceTwo.equalsIgnoreCase("no"))
				{
					System.out.println("Well today is not your lucky day. A jaguar has approached.");
					System.out.println("Do you run or fight?(type \"run\" or \"fight\")");
					String choiceThree = keyboard.next();
					if(choiceThree.equalsIgnoreCase("run"))
					{
						System.out.println("You have no way to slash through the thick vines and the jaguar catches you!\nYou are mauled to death by the jaguar\nGAME OVER! BETTER LUCK NEXT TIME!");
					}
					else if(choiceThree.equalsIgnoreCase("fight"))
					{
						System.out.println("You think you can take a jaguar? Well you can't and you are mauled to death.\nGAME OVER! BETTER LUCK NEXT TIME!");
					}
					else
					{
						System.out.println("THATS NOT AN OPTION I SAID YOU COULD CHOOSE! GAME OVER! GOODBYE!");
					}
				}
				else
				{
					System.out.println("THATS NOT AN OPTION I SAID YOU COULD CHOOSE! GAME OVER! GOODBYE!");
				}
			}
			else if(choiceOne == 3)//if you choose to search the cave
			{
				System.out.println("You find a giant cave, but its pitch black. You pull out your torch but you don't have any flint to make fire.");
				System.out.println("Do you look for flint with a 33% chance on the floor or contiue into the dark?(type \"yes\" or \"no\")");
				String choiceTwo = keyboard.next();
				if(choiceTwo.equalsIgnoreCase("yes"))
				{
					int num = r.nextInt(FLINT_RANGE);
					if(num == 0)
					{
						System.out.println("You find flint on the floor and are able to light your torch. You see two different paths you can take.");
						System.out.println("Do you take left or right?(type \"left\" or \"right\")");
						String choiceThree = keyboard.next();
						if(choiceThree.equalsIgnoreCase("left"))
						{
							System.out.println("It's not your lucky day. You find a bear that has just woken up from its slumber. You are mauled to death.\nGAME OVER! BETTER LUCK NEXT TIME!");
						}
						else if(choiceThree.equalsIgnoreCase("right"))
						{
							System.out.println("Congratulations, you just found one of the worlds biggest Emeralds! You are sure to make a profit!\nGAME OVER!");
						}
						else
						{
							System.exit(0);
						}
					}
					else
					{
						System.out.println("You become lost in the cave and are stuck wandering around forever!\nGAME OVER! BETTER LUCK NEXT TIME!");
					}
				}
				else
				{
					System.out.println("You become lost in the cave and are stuck wandering around forever!\nGAME OVER! BETTER LUCK NEXT TIME!");
				}
			}
			else
			{
				System.out.println("THATS NOT AN OPTION I SAID YOU COULD CHOOSE! GAME OVER! GOODBYE!");
			}
		}
		else
		{
			System.out.println("You are lame!");
			System.exit(0);
		}

	}

}
