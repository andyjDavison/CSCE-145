/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//<<4 digit binary #>> <<4 digit binary #>>
		System.out.println("Enter two 4 digit Binary numbers: ");
		String input = keyboard.nextLine();
		
		Scanner intScanner = new Scanner(input);
		
		int numOne = intScanner.nextInt();
		int numTwo = intScanner.nextInt();
		
		int indexThree = numOne%10;
		numOne = numOne/10;
		int indexTwo = indexThree%10;
		numOne = numOne/10;
		int indexOne = indexTwo%10;
		numOne = numOne/10;
		int indexZero = numOne%10;
		int decimalNum = (indexZero*8)+(indexOne*4)+(indexTwo*2)+(indexThree*1);
		
		int indexSeven = numTwo%10;
		numTwo = numTwo/10;
		int indexSix = indexSeven%10;
		numTwo = numTwo/10;
		int indexFive = indexSix%10;
		numTwo = numTwo/10;
		int indexFour = numTwo%10;
		int decimalNumTwo = (indexFour*8)+(indexFive*4)+(indexSix*2)+(indexSeven*1);
		
		int addDecimal = decimalNum+decimalNumTwo;
		
		System.out.println(decimalNumTwo);
		System.out.println(indexFour+" "+indexFive+" "+indexSix+" "+indexSeven);
		System.out.println(addDecimal);
		
		
		
	}

}
