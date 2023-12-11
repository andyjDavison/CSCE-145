/*
 * Written by Andrew Davison
 */
public class Car extends Vehicle{
	private double gasMileage;
	private int numberOfPassengers;
	
	public Car()
	{
		super();
		this.gasMileage = 0.0;
		this.numberOfPassengers = 0;
	}
	public Car(String aM, int aN, String aO, double aG, int aNp)
	{
		super(aM, aN, aO);
		this.setGasMileage(aG);
		this.setNumberOfPassengers(aNp);
	}
	public double getGasMileage()
	{
		return this.gasMileage;
	}
	public int getNumberOfPassengers()
	{
		return this.numberOfPassengers;
	}
	public void setGasMileage(double aG)
	{
		if(aG >= 0.0)
			this.gasMileage = aG;
		else
			this.gasMileage = 0.0;
	}
	public void setNumberOfPassengers(int aNp)
	{
		if(aNp >= 0)
			this.numberOfPassengers = aNp;
		else
			this.numberOfPassengers = 0;
	}
	public String toString()
	{
		return super.toString()+" Gas Mileage: "+this.gasMileage+" Number of Passengers: "+this.numberOfPassengers; 
	}
	public boolean equals(Car aC)
	{
		return aC != null &&
				super.equals(aC) &&
				this.gasMileage == aC.getGasMileage() &&
				this.numberOfPassengers == aC.getNumberOfPassengers();
	}

}
