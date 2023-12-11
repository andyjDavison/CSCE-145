/*
 * Written by Andrew Davison
 */
public class HollowDiamond extends BasicShape implements Diamond{
	private int width;
	public HollowDiamond()
	{
		super();
		this.width = 3;
	}
	public HollowDiamond(int aH, int aW)
	{
		super(aH);
		this.setWidth(aW);
	}
	public int getWidth()
	{
		return this.width;
	}
	public void setWidth(int aW)
	{
		if(aW >= 3)
		{
			if(aW%2 != 0)
				this.width = aW+1;
			else
				this.width = aW;
		}
		else
			this.width = 3;
	}
	public void drawShape()
	{
		//top half of diamond
		
		for(int i=1;i<=this.width-1;i++)
		{
			for(int j=this.width-1;j>i;j--)
			{
				System.out.print(" ");
			}
			skipSpaces(super.getHSpace());
			System.out.print("*");
			for(int j=1;j<(i-1)*2;j++)
			{
				System.out.print(" ");
			}
			if(i==1)
				System.out.print("\n");
			else
				System.out.print("*\n");
		}
		
		//bottom half
		for(int i=this.width-2;i>=1;i--)
		{
			for(int j=this.width-1;j>i;j--)
			{
				System.out.print(" ");
			}
			skipSpaces(super.getHSpace());
			System.out.print("*");
			for(int j=1;j<(i-1)*2;j++)
			{
				System.out.print(" ");
			}
			if(i==1)
				System.out.print("\n");
			else
				System.out.print("*\n");
		}
	}

}
