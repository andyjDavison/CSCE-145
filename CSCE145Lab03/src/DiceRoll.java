/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
import java.util.Random;
public class DiceRoll {

	public static final int DICE_RNG = 6;//recieve a number from 0 to 5
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Enter the number of times a 6-sided die should be rolled");
		int maxRolls = keyboard.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int rolls = 0;
		if(maxRolls > 0)
		{
			while(rolls<maxRolls)//continues loop while current number of rolls is less than inputed number of rolls
			{
				int num = r.nextInt(DICE_RNG);
				if(num == 0)//if the roll is this print out this(same for all other
				{
					System.out.println("1 was rolled");
					count1++;
					rolls++;
				}
				else if(num == 1)
				{
					System.out.println("2 was rolled");
					count2++;
					rolls++;
				}
				else if(num == 2)
				{
					System.out.println("3 was rolled");
					count3++;
					rolls++;
				}
				else if(num == 3)
				{
					System.out.println("4 was rolled");
					count4++;
					rolls++;
				}
				else if(num == 4)
				{
					System.out.println("5 was rolled");
					count5++;
					rolls++;
				}
				else
				{
					System.out.println("6 was rolled");
					count6++;
					rolls++;
				}
			}
		}
		else
		{
			System.out.println("Invalid number. Enter a number greater than 0");//roll must be greater than zero to get an output
			System.exit(0);
		}
		System.out.println("One: "+count1+"\nTwo: "+count2+"\nThree: "+count3+"\nFour: "+count4+"\nFive: "+count5+"\nSix: "+count6);//print out how many times a number was rolled
		

	}

}
