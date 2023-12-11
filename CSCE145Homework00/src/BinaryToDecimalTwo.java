/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class BinaryToDecimalTwo {

	public static void main(String[] args) {
		//<<4 digit binary #>> <<4 digit binary #>>
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two 4 digit binary numbers");
		
		String input = keyboard.nextLine();//Get next line of input from user
		String copyInput = input;
		
		int workingIndex = copyInput.indexOf(" ");//finds space in between numbers to separate them later
		String numOne = copyInput.substring(0, workingIndex);
		String numTwo = copyInput.substring(workingIndex+1);
		
		String sZero = numOne.substring(0,1);//Break up the first number into its 4 components
		int iZero = Integer.parseInt(sZero);
		String sOne = numOne.substring(1,2);
		int iOne = Integer.parseInt(sOne);
		String sTwo = numOne.substring(2,3);
		int iTwo = Integer.parseInt(sTwo);
		String sThree = numOne.substring(3);
		int iThree = Integer.parseInt(sThree);
		
		int decimalOne = (iZero*8)+(iOne*4)+(iTwo*2)+(iThree*1);//compute binary value to decimal by adding all numbers and their decimal value
		
		String sFour = numTwo.substring(0,1);//Break up second number into its 4 digits
		int iFour = Integer.parseInt(sFour);
		String sFive = numTwo.substring(1,2);
		int iFive = Integer.parseInt(sFive);
		String sSix = numTwo.substring(2,3);
		int iSix = Integer.parseInt(sSix);
		String sSeven = numTwo.substring(3);
		int iSeven = Integer.parseInt(sSeven);
		
		int decimalTwo = (iFour*8)+(iFive*4)+(iSix*2)+(iSeven*1);
		int addDecimal = decimalOne+decimalTwo;//Combine the numbers together
		
		System.out.println("First Decimal Number: "+decimalOne+"\nSecond Decimal Number: "+decimalTwo+"\nAdded Together: "+addDecimal);
	}

}
