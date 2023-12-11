/*
 * Written by Andrew Davison
 */
public class HouseCat extends Cat{
	private String type;
	
	public HouseCat()
	{
		super();
		this.type = "short Hair";
	}
	public HouseCat(String aN, double aW, String aM, String aT)
	{
		super(aN, aW, aM);
		this.setType(aT);
	}
	public String getType()
	{
		return this.type;
	}
	public void setType(String aT)
	{
		//short hair, ragdoll, sphinx, scottish fold
		if((aT != null) &&
				(aT.equalsIgnoreCase("short hair") ||
						aT.equalsIgnoreCase("ragdoll") ||
						aT.equalsIgnoreCase("sphinx") ||
						aT.equalsIgnoreCase("scottish fold")))
			this.type = aT;
		else
			this.type = "short hair";
	}
	public String toString()
	{
		return super.toString()+" Type: "+this.type;
	}
	public boolean equals(HouseCat aH)
	{
		return aH != null &&
				super.equals(aH) &&
				this.type.equalsIgnoreCase(aH.getType());
	}

}
