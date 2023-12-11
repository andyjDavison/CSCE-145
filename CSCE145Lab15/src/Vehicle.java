/*
 * Written by Andrew Davison
 */
public class Vehicle {
	private String manufacturersName;
	private int numberOfCylinders;
	private String ownersName;
	
	public Vehicle()
	{
		this.manufacturersName = "none";
		this.numberOfCylinders = 1;
		this.ownersName = "none";
	}
	public Vehicle(String aM, int aN, String aO)
	{
		this.setManufacturersName(aM);
		this.setNumberOfCylinders(aN);
		this.setOwnersName(aO);
	}
	public String getManufacturersName()
	{
		return this.manufacturersName;
	}
	public int getNumberOfCylinders()
	{
		return this.numberOfCylinders;
	}
	public String getOwnersName()
	{
		return this.ownersName;
	}
	public void setManufacturersName(String aM)
	{
		if(aM != null)
			this.manufacturersName = aM;
		else
			this.manufacturersName = "none";
	}
	public void setNumberOfCylinders(int aN)
	{
		if(aN > 0)
			this.numberOfCylinders = aN;
		else
			this.numberOfCylinders = 1;
	}
	public void setOwnersName(String aO)
	{
		if(aO != null)
			this.ownersName = aO;
		else
			this.ownersName = "none";
	}
	public String toString()
	{
		return "Manufacturers Name: "+this.manufacturersName+" # Of Cylinders: "+this.numberOfCylinders+" Owners Name: "+this.ownersName;
	}
	public boolean equals(Vehicle aV)
	{
		return aV != null &&
				this.manufacturersName.equals(aV.getManufacturersName()) &&
				this.numberOfCylinders == aV.getNumberOfCylinders() &&
				this.ownersName.equals(aV.getOwnersName());
	}

}
