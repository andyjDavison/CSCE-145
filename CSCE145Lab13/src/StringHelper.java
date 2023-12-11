/*
 * Written by Andrew Davison
 */
public class StringHelper {
	public static boolean hasAllUniqueCharacters(String aS)
	{
		return true;
	}
	public static String meshStrings(String s1, String s2)
	{
		String meshed = "";
		if(s1.length()>s2.length())
		{
			int i = 0;
			while(i<s2.length())
			{
				if(s2.length()-1==i)
					meshed += s1.substring(i,i+1)+s2.substring(i);
				else
					meshed += s1.substring(i,i+1)+s2.substring(i,i+1);
				i++;
			}
			meshed += s1.substring(i);
		}
		else if(s1.length()<s2.length())
		{
			int i = 0;
			while(i<s1.length())
			{
				if(s1.length()-1==i)
					meshed += s1.substring(i)+s2.substring(i,i+1);
				else
					meshed += s1.substring(i,i+1)+s2.substring(i,i+1);
				i++;
			}
			meshed += s2.substring(i);
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.length()-1==i)
					meshed += s1.substring(i)+s2.substring(i);
				else
					meshed += s1.substring(i,i+1)+s2.substring(i,i+1);
			}
		}
		return meshed;
		
	}
	public static String replaceVowelsWithOodle(String aS)
	{
		String[] replace = new String[aS.length()];
		String word = "";
		for(int i=0;i<replace.length;i++)
		{
			if(aS.length()-1 == i)
			{
				String letter = aS.substring(i);
				if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u"))
				{
					replace[i] = "oddle";
				}
				else
					replace[i] = letter;
			}
			else
			{
				String letter = aS.substring(i,i+1);
				if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u"))
				{
					replace[i] = "oddle";
				}
				else
					replace[i] = letter;
			}
		}
		for(int i=0;i<replace.length;i++)
			word = replace[i];
		return word;
			
	}
	public static double weight(String aS)
	{
		double weight = 0.0;
		int i = 0;
		while(i<aS.length())
		{
			if(aS.length()-1==i)
			{
				String s = aS.substring(i);
				if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u"))
					weight += 2.5;
				else
					weight += 3.4;
			}
			else
			{
				String s = aS.substring(i,i+1);
				if(s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u"))
					weight += 2.5;
				else
					weight += 3.4;
			}
			i++;
		}
		return weight;
	}
	

}
