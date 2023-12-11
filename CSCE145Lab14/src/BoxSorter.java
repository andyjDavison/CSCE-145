/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class BoxSorter {

	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		printGreetings();
		boolean quit = false;
		while(!false)
		{
			printChoices();
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			if(choice>0)
			{
				//enter box info, sort boxes into an array
				Box[] boxes = new Box[choice];
				setBoxes(boxes);
				sortBoxes(boxes);
				printBoxes(boxes);
				printChoices();
				int redo = keyboard.nextInt();
				keyboard.nextLine();
				if(redo>0)
					quit = false;
				else
					quit = true;
				
			}
			else
				quit = true;
		}

	}
	public static void printGreetings()
	{
		System.out.println("Welcome to Box Sorter!");
	}
	public static void printChoices()
	{
		System.out.println("Enter a number of boxes you want to add\n"
				+ "Enter 0 to quit");
	}
	public static void setBoxes(Box[] boxes)
	{
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter the label of box "+(i+1));
			String label = keyboard.nextLine();
			System.out.println("Enter the length of box "+(i+1));
			double length = keyboard.nextDouble();
			System.out.println("Enter the width of box "+(i+1));
			double width = keyboard.nextDouble();
			System.out.println("Enter the height of the box "+(i+1));
			double height = keyboard.nextDouble();
			keyboard.nextLine();
			boxes[i] = new Box(label, length, width, height);
		}
	}
	public static void sortBoxes(Box[] boxes)
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for(int i=0;i<boxes.length-1;i++)
			{
				if(boxes[i] == null || boxes[i+1] == null)
					break;
				if(boxes[i].getVolume() > boxes[i+1].getVolume())
				{
					Box temp = boxes[i];
					boxes[i] = boxes[i+1];
					boxes[i+1] = temp;
					swapped = true;
				}
			}
		}
	}
	public static void printBoxes(Box[] boxes)
	{
		for(int i=0;i<boxes.length;i++)
		{
			for(int j=0;j<boxes.length;j++)
			{
				System.out.print(boxes[i]);
			}
			System.out.println();
		}
	}

}
