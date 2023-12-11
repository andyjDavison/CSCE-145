/*
 * Written by Andrew Davison
 */
public class DomesticDog extends Dog{
	private String type;
	
	public DomesticDog() {
		super();
		this.type = "Mutt";
	}
	public DomesticDog(String aN, double aW, int aEL, String aT) {
		super(aN, aW, aEL);
		this.setType(aT);
	}
	public String getType() {
		return this.type;
	}
	public void setType(String aT) {
		if((aT != null) && (aT.equalsIgnoreCase("Retriever") ||
				aT.equalsIgnoreCase("Terrier") ||
				aT.equalsIgnoreCase("Husky") || 
				aT.equalsIgnoreCase("Mutt")))
			this.type = aT;
		else
			this.type = "Mutt";
	}
	public String toString() {
		return super.toString()+" Type: "+this.type;
	}
	public boolean equals(DomesticDog aDD) {
		return aDD != null &&
				super.equals(aDD) &&
				this.type.equalsIgnoreCase(aDD.getType());
	}

}
