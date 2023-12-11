/*
 * Written by Andrew Davison
 */
public class Animal {
	private String name;
	private double weight;
	
	public Animal()
	{
		this.name = "none";
		this.weight = 1.0;
	}
	public Animal(String aN, double aW)
	{
		this.setName(aN);
		this.setWeight(aW);
	}
	public String getName()
	{
		return this.name;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public void setName(String aN)
	{
		if(aN != null)
			this.name = aN;
		else
			this.name = "none";
	}
	public void setWeight(double aW)
	{
		if(aW >= 1.0)
			this.weight = aW;
		else
			this.weight = 1.0;
	}
	public String toString()
	{
		return " Name: "+this.name+" Weight: "+this.weight;
	}
	public boolean equals(Animal aA)
	{
		return aA != null &&
				this.name.equals(aA.getName()) &&
				this.weight == aA.getWeight();
	}

}
