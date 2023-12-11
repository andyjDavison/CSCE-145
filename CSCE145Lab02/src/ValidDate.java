/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class ValidDate {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date in Month/Day/Year format and Will check If it is valid");
		
		String date = keyboard.nextLine();//Recieve entire line of input from user <<month>>/<<day>>/<<year>>;
		String copyDate = date;
		
		int workingIndex = copyDate.indexOf("/");//This entire section will split up the line into the 3 pieces we need;
		String month = copyDate.substring(0,workingIndex);
		int lastWorkingIndex = copyDate.lastIndexOf("/");
		String day = copyDate.substring(workingIndex+1,lastWorkingIndex);
		String year = copyDate.substring(lastWorkingIndex+1);
		
		int intMonth = Integer.parseInt(month);
		int intDay = Integer.parseInt(day);
		int intYear = Integer.parseInt(year);
		
		boolean monthValid = true;
		boolean dayValid = true;
		boolean leapYear = false;
		
		if(intMonth>=0 && intMonth<=12)
		{
			monthValid = true;
			if(intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11)//April, june, September, and November;
			{
				if(intDay>=1 && intDay<=30)
				{
					dayValid = true;
				}
				else//if input isnt in domain then output that it is invalid;
				{
					dayValid = false;
					System.out.println(""+intMonth+"/"+intDay+"/"+intYear+" is invalid! The day is wrong for this month. Must be between 1 & 30");
				}
			}
			else if(intMonth == 2)
			{
				if(intDay>=1 && intDay<=29)
				{
					if(intDay == 29)
					{
						if((intYear%400) == 0 || ((intYear%4) == 0 && (intYear%100) != 0))//calculations to find out if year is Leap year;
						{
							leapYear = true;
						}
						else//if it is not a leap year then this date is not valid;
						{
							leapYear = false;
							System.out.println(""+intMonth+"/"+intDay+"/"+intYear+" is invalid! The date given is not a leap year.");
						}
					}
				}
				else
				{
					dayValid = false;
					System.out.println(""+intMonth+"/"+intDay+"/"+intYear+" is invalid! The day is wrong for this month. Must be between 1 & 29");
				}
			}
			else//all other months besides february april june september and november;
			{
				if(intDay>=1 && intDay<=31)
				{
					dayValid = true;
				}
				else
				{
					dayValid = false;
					System.out.println(""+intMonth+"/"+intDay+"/"+intYear+" is invalid! The day is wrong for this month. Must be between 1 & 31");
				}
			}
		}
		else
		{
			monthValid = false;
			System.out.println(""+intMonth+"/"+intDay+"/"+intYear+" is invalid! The month is wrong. Must be between 1 & 12");
		}
		
		if(monthValid)//if everything is true then the date is valid;
		{
			if(dayValid)
			{
				if(leapYear)
				{
					System.out.println(""+intMonth+"/"+intDay+"/"+intYear+" is a valid date!");
				}
			}
			
		}
		else
		{
			System.exit(0);
		}
		
		
		

	}

}
