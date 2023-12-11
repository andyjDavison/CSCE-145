/*
 * Written by Andrew Davison
 */
public class Jelly {
	private String name;
	private int calories;
	private String fruitType;
	
	public Jelly()
	{
		this.name = "none";
		this.calories = 50;
		this.fruitType = "grape";
	}
	public Jelly(String aN, int aC, String aT)
	{
		this.setName(aN);
		this.setCalories(aC);
		this.setFruitType(aT);
	}
	
	public String getName()
	{
		return this.name;
	}
	public int getCalories()
	{
		return this.calories;
	}
	public String getFruitType()
	{
		return this.fruitType;
	}
	
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setCalories(int aC)
	{
		if(aC >= 50 && aC <= 200)
			this.calories = aC;
		else
			this.calories = 50;
	}
	public void setFruitType(String aF)
	{
		if(aF != null)
		{
			if(aF.equalsIgnoreCase("apple") || aF.equalsIgnoreCase("blackberry") || aF.equalsIgnoreCase("grape") || aF.equalsIgnoreCase("mango") || aF.equalsIgnoreCase("tomato"))
				this.fruitType = aF;
			else
				this.fruitType = "grape";
		}
		else
			this.fruitType = "grape";
	}
	
	public boolean equals(Jelly aJ)
	{
		return aJ != null &&
				this.name.equalsIgnoreCase(aJ.getName()) &&
				this.calories == aJ.getCalories() &&
				this.fruitType.equalsIgnoreCase(aJ.getFruitType());
	}
	public String toString()
	{
		return "Brand: "+this.name+" Calories: "+this.calories+" Fruit: "+this.fruitType;
	}

}
