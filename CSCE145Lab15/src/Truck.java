/*
 * Written by Andrew Davison
 */
public class Truck extends Vehicle{
	private double loadCapacity;
	private double towingCapacity;
	
	public Truck()
	{
		super();
		this.loadCapacity = 0.0;
		this.towingCapacity = 0.0;
	}
	public Truck(String aM, int aN, String aO, double aL, double aT)
	{
		super(aM, aN, aO);
		this.setLoadCapacity(aL);
		this.setTowingCapacity(aT);
	}
	public double getLoadCapacity()
	{
		return this.loadCapacity;
	}
	public double getTowingCapacity()
	{
		return this.towingCapacity;
	}
	public void setLoadCapacity(double aL)
	{
		if(aL >= 0)
			this.loadCapacity = aL;
		else
			this.loadCapacity = 0.0;
	}
	public void setTowingCapacity(double aT)
	{
		if(aT >= 0)
			this.towingCapacity = aT;
		else
			this.towingCapacity = 0.0;
	}
	public String toString()
	{
		return super.toString()+" Load Capacity: "+this.loadCapacity+" Towing Capacity: "+this.towingCapacity; 
	}
	public boolean equals(Truck aTruck)
	{
		return aTruck != null &&
				super.equals(aTruck) &&
				this.loadCapacity == aTruck.getLoadCapacity() &&
				this.towingCapacity == aTruck.getTowingCapacity();
	}

}
