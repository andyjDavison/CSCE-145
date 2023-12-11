/*
 * Written by Andrew Davison
 */
public class Frame {
	private double size;
	private String type;
	
	//Constructors
	public Frame()
	{
		this.size = 18.5;
		this.type = "diamond";
	}
	public Frame(double aS, String aT)
	{
		this.setSize(aS);
		this.setType(aT);
	}
	
	//Accessors
	public double getSize()
	{
		return this.size;
	}
	public String getType()
	{
		return this.type;
	}
	
	//Mutators
	public void setSize(double aS)
	{
		if(this.size >= 18.5 && this.size <= 60.0)
			this.size = aS;
		else
			this.size = 18.5;
	}
	public void setType(String aT)
	{
		if(aT != null)
		{
			if(aT.equalsIgnoreCase("diamond") || aT.equalsIgnoreCase("step-through") || aT.equalsIgnoreCase("truss") || aT.equalsIgnoreCase("penny-farthing"))
				this.type = aT;
			else
				this.type = "diamond";
		}
		else
			this.type = "diamond";
	}
	
	public boolean equals(Frame aF)
	{
		return aF != null &&
				this.size == aF.getSize() &&
				this.type.equalsIgnoreCase(aF.getType());
	}
	public String toString()
	{
		return "[Frame] Size: "+this.size+" Type: "+this.type;
	}

}
