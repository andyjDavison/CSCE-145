/*
 * Written by Andrew Davison
 */
public class PBJSandwich {
	private Bread topSlice;
	private PeanutButter peanutButter;
	private Jelly jelly;
	private Bread bottomSlice;
	
	public PBJSandwich()
	{
		this.topSlice = new Bread();
		this.peanutButter = new PeanutButter();
		this.jelly = new Jelly();
		this.bottomSlice = new Bread();
	}
	public PBJSandwich(Bread top, PeanutButter aP, Jelly aJ, Bread bottom)
	{
		this.setTopSlice(top);
		this.setPeanutButter(aP);
		this.setJelly(aJ);
		this.setBottomSlice(bottom);
	}
	
	public Bread getTopSlice()
	{
		return this.topSlice;
	}
	public PeanutButter getPeanutButter()
	{
		return this.peanutButter;
	}
	public Jelly getJelly()
	{
		return this.jelly;
	}
	public Bread getBottomSlice()
	{
		return this.bottomSlice;
	}
	
	public void setTopSlice(Bread top)
	{
		if(top != null)
			this.topSlice = top;
		else
			this.topSlice = new Bread();
	}
	public void setPeanutButter(PeanutButter aP)
	{
		if(aP != null)
			this.peanutButter = aP;
		else
			this.peanutButter = new PeanutButter();
	}
	public void setJelly(Jelly aJ)
	{
		if(aJ != null)
			this.jelly = aJ;
		else
			this.jelly = new Jelly();
	}
	public void setBottomSlice(Bread bottom)
	{
		if(bottom != null)
			this.bottomSlice = bottom;
		else
			this.bottomSlice = new Bread();
	}
	
	public boolean equals(PBJSandwich aS)
	{
		return aS != null &&
				this.topSlice.equals(aS.getTopSlice()) &&
				this.peanutButter.equals(aS.getPeanutButter()) &&
				this.jelly.equals(aS.getJelly()) &&
				this.bottomSlice.equals(aS.getBottomSlice());
	}
	public String toString()
	{
		return "[SANDWICH] \nTop Slice: "+this.topSlice+"\nPeanutButter: "+this.peanutButter+"\nJelly: "+this.jelly+"\nBottom Slice: "+this.bottomSlice;
	}

}
