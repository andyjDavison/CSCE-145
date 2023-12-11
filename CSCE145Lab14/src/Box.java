/*
 * Written by Andrew Davison
 */
public class Box {
	private String label;
	private double length;
	private double width;
	private double height;
	public Box()
	{
		this.label = "none";
		this.length = 1.0;
		this.width = 1.0;
		this.height = 1.0;
	}
	public Box(String aS, double aL, double aW, double aH)
	{
		this.setLabel(aS);
		this.setLength(aL);
		this.setWidth(aW);
		this.setHeight(aH);
	}
	public String getLabel()
	{
		return this.label;
	}
	public double getLength()
	{
		return this.length;
	}
	public double getWidth()
	{
		return this.width;
	}
	public double getHeight()
	{
		return this.height;
	}
	public void setLabel(String aS)
	{
		if(aS != null)
			this.label = aS;
		else
			this.label = "none";
	}
	public void setLength(double aL)
	{
		if(aL>0)
			this.length = aL;
		else
			this.length = 1.0;
	}
	public void setWidth(double aW)
	{
		if(aW>0)
			this.width = aW;
		else
			this.width = 1.0;
	}
	public void setHeight(double aH)
	{
		if(aH>0)
			this.height = aH;
		else
			this.height = 1.0;
	}
	public double getVolume()
	{
		return this.length*this.width*this.height;
	}
	public String toString()
	{
		return "Label: "+this.label+" Volume: "+(this.length*this.width*this.height);
	}

}
