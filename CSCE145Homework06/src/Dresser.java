/*
 * Written by Andrew Davison
 */
public class Dresser {
	private Clothing[][] clothes;
	private static final int HEIGHT = 5;
	private static final int LENGTH = 10;
	public Dresser()
	{
		this.clothes = new Clothing[HEIGHT][LENGTH];
	}
	public void add(Clothing aC)
	{
		if(aC == null)
			return;
		for(int i=0;i<clothes.length;i++)
		{
			if(aC.getType().equalsIgnoreCase("Undergarments") && i==0)
			{
				for(int j=0;j<clothes[i].length;j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aC;
						break;
					}
				}
			}
			if((aC.getType().equalsIgnoreCase("Socks") || aC.getType().equalsIgnoreCase("Stockings")) && i==1)
			{
				for(int j=0;j<clothes[i].length;j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aC;
						break;
					}
				}
			}
			if(aC.getType().equalsIgnoreCase("Top") && i==2)
			{
				for(int j=0;j<clothes[i].length;j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aC;
						break;
					}
				}
			}
			if(aC.getType().equalsIgnoreCase("Bottom") && i==3)
			{
				for(int j=0;j<clothes[i].length;j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aC;
						break;
					}
				}
			}
			if(aC.getType().equalsIgnoreCase("Cape") && i==4)
			{
				for(int j=0;j<clothes[i].length;j++)
				{
					if(clothes[i][j] == null)
					{
						clothes[i][j] = aC;
						break;
					}
				}
			}
			if(clothes[i][clothes[i].length-1] != null)
			{
				System.out.println("That Drawer is Full");
				return;
			}
		}
	}
	public void remove(String aT, String aC)
	{
		int removeIndex = -1;
		for(int i=0;i<clothes.length;i++)
		{
			for(int j=0;j<clothes[i].length;j++)
			{
				if(clothes[i][j] != null && clothes[i][j].getType().equals(aT) && clothes[i][j].getColor().equals(aC))
				{
					removeIndex = j;
					break;
				}
			}
			if(removeIndex == -1)
				return;
			else
			{
				for(int j=removeIndex;j<clothes.length-1;j++)
					clothes[i][j] = clothes[i][j+1];
				clothes[i][clothes[i].length-1] = null;
			}
		}
	}
	public void print()
	{
		for(int i=0;i<clothes.length;i++)
		{
			for(int j=0;j<clothes[i].length;j++)
			{
				System.out.print(clothes[i][j]+" ");
			}
			System.out.println();
		}
	}

}
