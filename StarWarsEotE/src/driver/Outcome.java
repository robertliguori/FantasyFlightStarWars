package driver;

public class Outcome {
	int successMargin;
	int advOrThreatMargin;
	int triCount;
	int despCount;
	public Outcome(int successMargin, int advOrThreatMargin, int triCount, int despCount) {
		super();
		this.successMargin = successMargin;
		this.advOrThreatMargin = advOrThreatMargin;
		this.triCount = triCount;
		this.despCount = despCount;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Sucess margin: " + successMargin+"\n");
		if (advOrThreatMargin > 0) {
			sb.append("Advantage! Margin: " + advOrThreatMargin+"\n");
		}
		if (advOrThreatMargin < 0) {
			sb.append("Threat! Margin: " + -advOrThreatMargin+"\n");
		}
		if (triCount > 0) {
			sb.append("Triumph!!! Margin: " + triCount+"\n");
		}
		if (despCount > 0) {
			sb.append("Despair!!! Margin: " + despCount+"\n");
		}
		return sb.toString();
	}
	
	
	

}
