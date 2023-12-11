/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to matrix adder!\nPlease enter the length and width of the first matrix");
		int length1 = keyboard.nextInt();
		int width1 = keyboard.nextInt();
		
		//matrix 1
		int[][] m1 = new int[length1][width1]; 
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				System.out.println("Enter value at index "+i+" "+j);
				m1[i][j] = keyboard.nextInt();
			}
		}
		
		System.out.println("\nPlease enter the the length and width of the second matrix");
		int length2 = keyboard.nextInt();
		int width2 = keyboard.nextInt();
		int[][] m2 = new int[length2][width2];
		if(length1 != length2 || width1 != width2)//check to see if the lengths or widths are different
		{
			System.out.println("Invalid Dimensions. These cannot be added.");
			System.exit(0);
		}
		else
		{
			//matrix 2
			for(int i=0;i<m2.length;i++)
			{
				for(int j=0;j<m2[i].length;j++)
				{
					System.out.println("Enter value at index "+i+" "+j);
					m2[i][j] = keyboard.nextInt();
				}
			}
		}
		
		//add matrices
		int[][] mAdd = new int[length1][width1];
		for(int i=0;i<mAdd.length;i++)
		{
			for(int j=0;j<mAdd[i].length;j++)
			{
				mAdd[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		//print matrices
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("+");
		for(int i=0;i<m2.length;i++)
		{
			for(int j=0;j<m2[i].length;j++)
			{
				System.out.print(m2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=");
		for(int i=0;i<mAdd.length;i++)
		{
			for(int j=0;j<mAdd[i].length;j++)
			{
				System.out.print(mAdd[i][j]+" ");
			}
			System.out.println();
		}

	}

}
