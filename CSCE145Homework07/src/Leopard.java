/*
 * Written by Andrew Davison
 */
public class Leopard extends Cat{
	private int numberOfSpots;
	
	public Leopard()
	{
		super();
		this.numberOfSpots = 1;
	}
	public Leopard(String aN, double aW, String aM, int aNs)
	{
		super(aN, aW, aM);
		this.setNumberOfSpots(aNs);
	}
	public int getNumberOfSpots()
	{
		return this.numberOfSpots;
	}
	public void setNumberOfSpots(int aNs)
	{
		if(aNs >= 1)
			this.numberOfSpots = aNs;
		else
			this.numberOfSpots = 1;
	}
	public String toString()
	{
		return super.toString()+" Number of Spots: "+this.numberOfSpots;
	}
	public boolean equals(Leopard aL)
	{
		return aL != null &&
				super.equals(aL) &&
				this.numberOfSpots == aL.getNumberOfSpots();
	}

}
