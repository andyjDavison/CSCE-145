/*
 * Written by Andrew Davison
 */
public class Wolf extends Dog{
	private String packLeader;
	
	public Wolf() {
		super();
		this.packLeader = "none";
	}
	public Wolf(String aN, double aW, int aEL, String aP) {
		super(aN, aW, aEL);
		this.setPackLeader(aP);
	}
	public String getPackLeader() {
		return this.packLeader;
	}
	public void setPackLeader(String aP) {
		if(aP != null)
			this.packLeader = aP;
		else
			this.packLeader = "none";
	}
	public String toString() {
		return super.toString()+" Pack Leader: "+this.packLeader;
	}
	public boolean equals(Wolf aWolf) {
		return aWolf != null &&
				super.equals(aWolf) &&
				this.packLeader.equalsIgnoreCase(aWolf.getPackLeader());
	}

}
