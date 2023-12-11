/*
 * Written by Andrew Davison
 */
public class Clothing {
	private String type;
	private String color;
	public Clothing()
	{
		this.type = "Socks";
		this.color = "Black";
	}
	public Clothing(String aT, String aC)
	{
		this.setType(aT);
		this.setColor(aC);
	}
	public String getType()
	{
		return this.type;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setType(String aT)
	{
		if(aT != null && (aT.equals("Undergarments") || aT.equals("Socks") || aT.equals("Stockings") || aT.equals("Top") || aT.equals("Bottom") || aT.equals("Cape")))
			this.type = aT;
		else
			this.type = "Socks";
	}
	public void setColor(String aC)
	{
		if(aC != null && (aC.equals("Brown")||aC.equals("Red")||aC.equals("Pink")||aC.equals("Black")||aC.equals("White")||aC.equals("Orange")||aC.equals("Green")||aC.equals("Blue")||aC.equals("Purple")||aC.equals("Grey")))
			this.color = aC;
		else
			this.color = "Black";
	}
	public String toString()
	{
		return "[Clothing] Type: "+this.type+" Color: "+this.color;
	}
	public boolean equals(Clothing aC)
	{
		return aC != null &&
				this.type.equalsIgnoreCase(aC.getType()) &&
				this.color.equalsIgnoreCase(aC.getColor());
	}

}
