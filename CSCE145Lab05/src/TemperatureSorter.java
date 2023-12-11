/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class TemperatureSorter {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] a = new double[10];// create a new array
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the temperature for day "+(i+1));
			double temp = keyboard.nextDouble();
			a[i] = temp;//fill each index of the array with the user input
		}
		//avg temp
		double sum = 0.0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		double avg = sum/10.0;
		System.out.println("The average temperature was "+avg);
		//below avg
		System.out.println("The days that were below average were");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<avg)
			{
				System.out.println("Day "+(i+1)+" with "+a[i]);//print out day number and the temp of that day
			}
		}

	}

}
