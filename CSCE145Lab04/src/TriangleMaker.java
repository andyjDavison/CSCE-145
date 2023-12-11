/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class TriangleMaker {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number greater than 0 to represent the size of your triangle");
		
		
		int width = keyboard.nextInt();//used to get the longest piece of the triangle
		
		if(width<=0)
		{
			System.out.println("That number is invalid!");
			System.exit(0);
		}
		
		for(int i=0;i<width;i++)//to create the top part of the triangle
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*" + " ");//prints out a star while j is less than or equal to i(meaning the row number is the same as the amount of stars in that row)
			}
			System.out.println();
		}
		for(int i=width-1;i>=0;i--)//to make the bottom part of the triangle
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

}
