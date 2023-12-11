/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static final int COMP_RANGE = 3;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		boolean play = true;
		int userPts = 0;
		int compPts = 0;
		
		if(play)
		{

			System.out.println("Welcome to rock paper scissors! To play type \"rock\", \"paper\", or \"scissors\"");
			int rounds = 0;
			while(rounds < 3)//put this on outside of everything
			{
				
				String userChoice = keyboard.nextLine();
				String compChoice;
				int comp = r.nextInt();
				
				if(comp == 0)
				{
					compChoice = "rock";
				}
				else if(comp == 1)
				{
					compChoice = "paper";
				}
				else
				{
					compChoice = "scissors";
				}
				if(userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper") || userChoice.equalsIgnoreCase("scissors"))
				{
					if(userChoice.equalsIgnoreCase("rock"))
					{
						if(userChoice.equalsIgnoreCase(compChoice))
						{
							System.out.println("Round Tie! No points awarded.");
						}
						else
						{
							if(compChoice.equalsIgnoreCase("paper"))
							{
								System.out.println("Paper beats rock! 1 point for the computer.");
								compPts +=1;
							}
							else
							{
								System.out.println("Rock beats scissors! 1 point for you.");
								userPts +=1;
							}
						}
					}
					if(userChoice.equalsIgnoreCase("paper"))
					{
						if(userChoice.equalsIgnoreCase(compChoice))
						{
							System.out.println("Round Tie! No points awarded.");
						}
						else
						{
							if(compChoice.equalsIgnoreCase("rock"))
							{
								System.out.println("Paper beats rock! 1 point for you.");
								userPts +=1;
							}
							else
							{
								System.out.println("Scissors beat paper! 1 point for the computer.");
								compPts +=1;
							}
						}
					}
					if(userChoice.equalsIgnoreCase("scissors"))
					{
						if(userChoice.equalsIgnoreCase(compChoice))
						{
							System.out.println("Round Tie! No points awarded.");
						}
						else
						{
							if(compChoice.equalsIgnoreCase("rock"))
							{
								System.out.println("Rock beats scissors! 1 point for the computer.");
								compPts +=1;
							}
							else
							{
								System.out.println("Scissors beat paper! 1 point for you.");
								userPts +=1;
							}
						}
					}
				}
				else
				{
					System.out.println("Not a valid answer! The computer gets a point.");
					compPts +=1;
				}
				rounds++;
			}
			System.out.println("Your points: "+userPts+"\nComputer points: "+compPts);
			if(userPts>compPts)
			{
				System.out.println("Congratulations you won");
			}
			else if(compPts>userPts)
			{
				System.out.println("The computer won. Better luck next time!");
			}
			else
			{
				System.out.println("Looks like it was a tie.");
			}
			System.out.println("Would you like to play again? Type \"yes\" or \"no\"");
			String retry = keyboard.next();
			if(retry.equalsIgnoreCase("yes"))
			{
				play = true;
			}
			else
			{
				play = false;
			}
		}
		else
		{
			System.out.println("Okay! Goodbye!");
			System.exit(0);
		}
		
	}

}
