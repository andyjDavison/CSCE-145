/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {

	public static final int COMP_RNG = 3;
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		boolean play = true;//used for restarts. If user answers no at bottom play becomes false. program ends
		while(play)
		{
			System.out.println("Welcome to Rock Paper Scissors!\nTo begin type \"rock\", \"paper\", or \"scissors\".");
			int userPts=0, compPts = 0;
			int rounds = 0;
			int computer = r.nextInt(COMP_RNG);//used to get either 0, 1, or 2, which is then turned into paper rock or scissors
			while(rounds<3)
			{
				String userChoice = keyboard.next();
				String compChoice;
				if(computer == 0)//used to convert the random number into a string to represent computers choice
				{
					compChoice = "rock";
				}
				else if(computer == 1)
				{
					compChoice = "paper";
				}
				else
				{
					compChoice = "scissors";
				}
				System.out.println("The computer chooses "+compChoice);				
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
				computer = r.nextInt(COMP_RNG);
				rounds++;
			}
			System.out.println("Your Points: "+userPts+"\nComputer's Points: "+compPts);
			if(userPts>compPts)
			{
				System.out.println("Looks like you won! Would you like to play again?");
			}
			else if(userPts<compPts)
			{
				System.out.println("The computer beat you! Would you like to play again?");
			}
			else
			{
				System.out.println("It was a tie. Would you like to play again?");
			}
			
			System.out.println("Type \"yes\" or \"no\"");
			String retry = keyboard.next();
			if(retry.equalsIgnoreCase("no"))//if this is no game ends and the while loops doesnt keep going
			{
				play = false;
				System.out.println("Ok goodbye!");
				System.exit(0);
			}
			else//while loop keeps running until user types no
			{
				play = true;
			}
		}
		
		
	}

}
