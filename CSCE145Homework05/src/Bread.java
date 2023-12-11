/*
 * Written by Andrew Davison
 */
public class Bread {
	private String name;
	private int calories;
	private String type;
	
	//Constructors
	public Bread()
	{
		this.name = "none";
		this.calories = 50;
		this.type = "Whole Grain";
	}
	public Bread(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setType(aT);
	}
	
	//Accesors
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public String getType()
	{
		return this.type;
	}
	
	//Mutators
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if(aC >= 50 && aC <= 250)
			this.calories = aC;
		else
			this.calories = 50;
	}
	public void setType(String aT)
	{
		if(aT != null)
		{
			if(aT.equalsIgnoreCase("honey wheat") || aT.equalsIgnoreCase("white") || aT.equalsIgnoreCase("whole grain") || aT.equalsIgnoreCase("whole wheat"))
				this.type = aT;
			else
				this.type = "whole grain";
		}
	}
	
	public boolean equals(Bread aB)
	{
		return aB != null &&
				this.name.equalsIgnoreCase(aB.getName()) &&
				this.calories == aB.getCalories() &&
				this.type.equalsIgnoreCase(aB.getType());
	}
	public String toString()
	{
		return " Brand: "+this.name+" Calories: "+this.calories+" Type: "+this.type;
	}

}
