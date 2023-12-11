/*
 * Written by Andrew Davison
 */
public class Apple {
	//make private to hide info
	private String type;
	private double weight;
	private double price;
	
	//default
	public Apple()
	{
		type = "Gala";
		weight = 0.0;
		price = 0.0;
	}
	public Apple(String aT, double aW, double aP)//w parameters
	{
		this.setType(aT);
		this.setWeight(aW);
		this.setPrice(aP);
	}
	
	//getters
	public String getType()
	{
		return this.type;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public double getPrice()
	{
		return this.price;
	}
	
	//setters
	public void setType(String aT)
	{
		if(aT != null && (aT.equalsIgnoreCase("Red Delicious") || aT.equalsIgnoreCase("Gold Delicious") || aT.equalsIgnoreCase("Granny Smith")))
		{
			this.type = aT;
		}
		else
		{
			this.type = "Gala";
		}
	}
	public void setWeight(double aW)
	{
		if(aW>=0.0 && aW<=2.0)
		{
			this.weight = aW;
		}
		else
		{
			this.weight = 0.0;
		}
	}
	public void setPrice(double aP)
	{
		if(aP>=0.0)
		{
			this.price = aP;
		}
		else
		{
			this.price = 0.0;
		}
	}
	
	//other methods
	public String toString()
	{
		return "Type: "+this.type+" Weight: "+this.weight+" Price: "+this.price;
	}
	public boolean equals(Apple aA)
	{
		return aA != null &&
				this.type.equals(aA.getType()) &&
				this.weight == aA.getWeight() &&
				this.price == aA.getPrice();
	}

}
