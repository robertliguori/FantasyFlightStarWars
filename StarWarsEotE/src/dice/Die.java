package dice;

import java.util.List;

public abstract class Die {
	
	public int faces = 0;
	
	public int rollNumeric() {
		int lFaces = faces;
		return ((int)(Math.random() * lFaces)+1);	
	}

	
	public List<Symbol> roll() {
		return null;
	}

}
