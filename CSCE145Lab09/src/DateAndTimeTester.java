/*
 * Written by Andrew Davison
 */
import java.util.Scanner;
public class DateAndTimeTester {
	
	public void run()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
		String input = keyboard.nextLine();
		boolean quit = false;
		while(!quit)
		{
			if(isValid(isValidDate(input),isValidTime(input)))
			{
				System.out.println("The date and time is valid!");
			}
			else
			{
				System.out.println("The date and time is not valid.");
			}
			System.out.println("Press Enter to keep converting units or enter \"quit\" to quit");
			quit = keyboard.nextLine().equalsIgnoreCase("quit");
		}
		System.out.println("Goodbye!");
		
	}
	public boolean isValid(boolean a, boolean b)
	{
		return a&&b;
	}
	public boolean isValidDate(String s)
	{
		if(getMonth(s)>0 && getMonth(s)<=12)
		{
			if(getMonth(s)==2)
			{
				if(getDay(s)>=1 && getDay(s)<=28)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else if(getMonth(s)==4 || getMonth(s)==6 || getMonth(s)==9 || getMonth(s)==11)
			{
				if(getDay(s)>=1 && getDay(s)<=30)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				if(getDay(s)>=1 && getDay(s)<=31)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		else
		{
			return false;
		}
	}
	public boolean isValidTime(String s)
	{
		if(getHour(s)>=1 && getHour(s)<=12)
		{
			if(getMinute(s)>=0 && getMinute(s)<=60)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	public int getMonth(String s)
	{
		int workingIndex = s.indexOf("/");
		String sMonth = s.substring(0,workingIndex);
		int iMonth = Integer.parseInt(sMonth);
		return iMonth;
	}
	public int getDay(String s)
	{
		int workingIndex = s.indexOf("/");
		String sDay = s.substring(workingIndex+1,s.indexOf(" "));
		int iDay = Integer.parseInt(sDay);
		return iDay;
	}
	public int getHour(String s)
	{
		int workingIndex = s.indexOf(" ");
		String sHour = s.substring(workingIndex+1,s.indexOf(":"));
		int iHour = Integer.parseInt(sHour);
		return iHour;
	}
	public int getMinute(String s)
	{
		int workingIndex = s.indexOf(":");
		String sMinute = s.substring(workingIndex+1);
		int iMinute = Integer.parseInt(sMinute);
		return iMinute;
	}

}
