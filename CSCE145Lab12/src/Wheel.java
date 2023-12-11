/*
 * Written by Andrew Davison
 */
public class Wheel {
	private double diameter;
	private double width;
	
	//Constructors
	public Wheel()
	{
		this.diameter = 16.0;
		this.width = 1.0;
	}
	public Wheel(double aD, double aW)
	{
		this.setDiameter(aD);
		this.setWidth(aW);
	}
	
	//Accessors
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getWidth()
	{
		return this.width;
	}
	
	//Mutators
	public void setDiameter(double aD)
	{
		if(this.diameter >= 16.0 && this.diameter <= 55.0)
			this.diameter = aD;
		else
			this.diameter = 16.0;
	}
	public void setWidth(double aW)
	{
		if(this.width >= 1.0 && this.width <= 2.5)
			this.width = aW;
		else
			this.width = 1.0;
	}
	
	public boolean equals(Wheel aW)
	{
		return aW != null &&
				this.diameter == aW.getDiameter() &&
				this.width == aW.getWidth();
	}
	public String toString()
	{
		return "[Wheel] Diameter: "+this.diameter+" Width: "+this.width;
	}

}
