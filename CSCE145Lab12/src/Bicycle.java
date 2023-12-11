/*
 * Written by Andrew Davison
 */
public class Bicycle {
	private String make;
	private Wheel FrontWheel;
	private Wheel BackWheel;
	private Frame frame;
	
	public Bicycle()
	{
		this.make = "none";
		this.FrontWheel = new Wheel();
		this.BackWheel = new Wheel();
		this.frame = new Frame();
	}
	public Bicycle(String aM, Wheel aFront, Wheel aBack, Frame aF)
	{
		this.setMake(aM);
		this.setFrontWheel(aFront);
		this.setBackWheel(aBack);
		this.setFrame(aF);
	}
	
	public String getMake()
	{
		return this.make;
	}
	public Wheel getFrontWheel()
	{
		return this.FrontWheel;
	}
	public Wheel getBackWheel()
	{
		return this.BackWheel;
	}
	public Frame getFrame()
	{
		return this.frame;
	}
	
	public void setMake(String aM)
	{
		if(aM != null)
			this.make = aM;
		else
			this.make = "none";
	}
	public void setFrontWheel(Wheel aFront)
	{
		if(aFront != null)
			this.FrontWheel = aFront;
		else
			this.FrontWheel = new Wheel();
	}
	public void setBackWheel(Wheel aBack)
	{
		if(aBack != null)
			this.BackWheel = aBack;
		else
			this.BackWheel = new Wheel();
	}
	public void setFrame(Frame aF)
	{
		if(aF != null)
			this.frame = aF;
		else
			this.frame = new Frame();
	}
	
	public boolean equals(Bicycle aB)
	{
		return aB != null &&
				this.make.equals(aB.getMake()) &&
				this.FrontWheel.equals(aB.getFrontWheel()) &&
				this.BackWheel.equals(aB.getBackWheel()) &&
				this.frame.equals(aB.getFrame());
	}
	public String toString()
	{
		return "[Bicycle] Make: "+this.make+" Front Wheel "+this.FrontWheel+" Back Wheel "+this.BackWheel+" Frame: "+this.frame;
	}

}
