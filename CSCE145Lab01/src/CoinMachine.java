/*
 * Written by Andrew Davison
 */
import java.util.Scanner;//must import scanner
public class CoinMachine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter whole number from 0 to 99. The coin machine will determine output of coins.");//prompt user for inuput
	
		int amount = keyboard.nextInt();//put user input into int
		
		int quarter = amount/25;//get number of quarters
		amount = amount%25;//get remainder of un-counted money
		
		int dime = amount/10;//get number of dimes
		amount = amount%10;//remainder...etc
		
		int nickel = amount/5;//get number of nickels
		amount = amount%5;
		
		int penny = amount;//number of pennies
	
		System.out.println("Quarters: "+quarter+"\nDimes: "+dime+"\nNickels "+nickel+"\nPennies: "+penny);
		
		//1.To find number of hours simply divide the minutes by 60. That is the number of hours. To find remaining minutes
		// simply use %60 on the minutes and store in int remMin;
		//2.The % operator only works on type ints;
	
	
	}

}
