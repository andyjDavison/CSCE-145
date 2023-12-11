/*
 * Written by Andrew Davison
 */
public class Coffee {
	private String name;//info hiding
	private int caffeine;
	
	public Coffee()//default 
	{
		this.name = "none";
		this.caffeine = 50;
	}
	public Coffee(String aN, int aC)
	{
		this.setName(aN);
		this.setCaffeine(aC);
	}
	
	//getters
	public String getName()
	{
		return this.name;
	}
	public int getCaffeine()
	{
		return this.caffeine;
	}
	
	//setters
	public void setName(String aN)
	{
		if(aN != null)
		{
			this.name = aN;
		}
		else
		{
			this.name = "none";
		}
	}
	public void setCaffeine(int aC)
	{
		if(aC>=50 && aC<=300)
		{
			this.caffeine = aC;
		}
		else
		{
			this.caffeine = 50;
		}
	}
	
	//other methods
	public String toString()
	{
		return "Coffee "+this.name+" has "+this.caffeine+"mg of caffeine";
	}
	public boolean equals(Coffee aC)
	{
		return aC != null &&
				this.name.equals(aC.getName()) &&
				this.caffeine == aC.getCaffeine();
	}
	public double riskyAmount()
	{
		return 180.0/((this.caffeine/100.0)*60.0);
	}

}
