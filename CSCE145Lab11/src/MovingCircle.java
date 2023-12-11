/*
 * Written by Andrew Davison
 */
public class MovingCircle {
	private double xPos;
	private double yPos;
	private double diameter;
	private double xVel;
	private double yVel;
	
	//Constructors
	public MovingCircle()
	{
		this.xPos = 0.0;
		this.yPos = 0.0;
		this.diameter = 0.0;
		this.xVel = 0.0;
		this.yVel = 0.0;
	}
	public MovingCircle(double aXPos,double aYPos,double aD,double aXVel,double aYVel)
	{
		this.setXPos(aXPos);
		this.setYPos(aYPos);
		this.setDiameter(aD);
		this.setXVel(aXVel);
		this.setYVel(aYVel);
	}
	
	//Accessors
	public double getXPos()
	{
		return this.xPos;
	}
	public double getYPos()
	{
		return this.yPos;
	}
	public double getDiameter()
	{
		return this.diameter;
	}
	public double getXVel()
	{
		return this.xVel;
	}
	public double getYVel()
	{
		return this.yVel;
	}
	
	//mutators
	public void setXPos(double aXPos)
	{
		this.xPos = aXPos;
	}
	public void setYPos(double aYPos)
	{
		this.yPos = aYPos;
	}
	public void setDiameter(double aD)
	{
		if(aD<=0)
			this.diameter = 0.0;
		else
			this.diameter = aD;
	}
	public void setXVel(double aXVel)
	{
		this.xVel = aXVel;
	}
	public void setYVel(double aYVel)
	{
		this.yVel = aYVel;
	}
	
	public boolean equals(MovingCircle aC)
	{
		return aC != null &&
				this.xPos == aC.getXPos() &&
				this.yPos == aC.getYPos() &&
				this.diameter == aC.getDiameter() &&
				this.xVel == aC.getXVel() &&
				this.yVel == aC.getYVel();
	}
	public String toString()
	{
		return this.xPos+" "+this.yPos+" "+this.diameter+" "+this.xVel+" "+this.yVel;
	}
	public void move()
	{
		this.xPos +=this.xVel;
		this.yPos +=this.yVel;
	}
	//returns if the circles have collided
	public boolean isColliding(MovingCircle aC)
	{
		double addRadius = (this.diameter+aC.getDiameter())/2.0;
		double distance = Math.sqrt(Math.pow((aC.getXPos()-this.xPos),2)+Math.pow((aC.getYPos()-this.yPos),2));
		return addRadius>=distance;
	}

}
