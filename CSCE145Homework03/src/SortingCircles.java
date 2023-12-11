/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class SortingCircles {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Circle Sort!\nEnter the size of your collection of circles.");
		int size = keyboard.nextInt();
		while(size <= 0)
		{
			System.out.println("That is an invalid size.");
			System.out.println("Enter the size of your collection of circles.");
			size = keyboard.nextInt();
		}
		//make array of areas
		double[] a = new double[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter a radius for circle "+(i+1));
			double radius = keyboard.nextInt();
			double area = radius*Math.PI;
			a[i] = area;
		}
		System.out.println("Do you want the areas ascending or descending?\nEnter \"a\" for ascending and \"d\" for descending.");
		String choice = keyboard.next();
		if(choice.equalsIgnoreCase("a"))
		{
			//sort areas small to large
			for(int i=0;i<a.length;i++)
			{
				int smallestIndex = i;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]<a[smallestIndex])
					{
						smallestIndex = j;
					}
				}
				if(smallestIndex != i)
				{
					//swap
					double temp = a[i];
					a[i] = a[smallestIndex];
					a[smallestIndex] = temp;
				}
			}
			//print
			System.out.println("The areas sorted from smalles to largest is:");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		else if(choice.equalsIgnoreCase("d"))
		{
			//sort areas large to small
			for(int i=0;i<a.length;i++)
			{
				int largestIndex = i;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]>a[largestIndex])
					{
						largestIndex = j;
					}
				}
				if(largestIndex != i)
				{
					//swap
					double temp = a[i];
					a[i] = a[largestIndex];
					a[largestIndex] = temp;
				}
			}
			//print
			System.out.println("The areas sorted from largest to smalles is:");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}

}
