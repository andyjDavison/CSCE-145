/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class VowelCountSort {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the vowel counter and sorter!\nEnter a phrase!");
		String phrase = keyboard.nextLine();
		String[] s = {"a", "e", "i", "o", "u"};
		//make int array blank
		int[] a = new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i] = 0;
		}
		//fill int array with counts of vowels
		for(int i=0;i<phrase.length();i++)
		{
			if(i==phrase.length()-1)
			{
				if(phrase.substring(i).equalsIgnoreCase("a"))
				{
					a[0] += 1;
				}
				if(phrase.substring(i).equalsIgnoreCase("e"))
				{
					a[1] += 1;
				}
				if(phrase.substring(i).equalsIgnoreCase("i"))
				{
					a[2] += 1;
				}
				if(phrase.substring(i).equalsIgnoreCase("o"))
				{
					a[3] += 1;
				}
				if(phrase.substring(i).equalsIgnoreCase("u"))
				{
					a[4] += 1;
				}
			}
			else
			{
				if(phrase.substring(i,i+1).equalsIgnoreCase("a"))
				{
					a[0] += 1;
				}
				if(phrase.substring(i,i+1).equalsIgnoreCase("e"))
				{
					a[1] += 1;
				}
				if(phrase.substring(i,i+1).equalsIgnoreCase("i"))
				{
					a[2] += 1;
				}
				if(phrase.substring(i,i+1).equalsIgnoreCase("o"))
				{
					a[3] += 1;
				}
				if(phrase.substring(i,i+1).equalsIgnoreCase("u"))
				{
					a[4] += 1;
				}
			}
		}

		//selection sort
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
				//swap int array
				int aTemp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = aTemp;
				//swap string array
				String sTemp = s[i];
				s[i] = s[smallestIndex];
				s[smallestIndex] = sTemp;
			}
		}
		System.out.println("The vowels and their count");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(s[i] + " " + a[i]);
		}
		

	}

}
