package dice;

import java.util.Arrays;
import java.util.List;

public class ForceDie extends Die {
	
	
	public ForceDie() {
		super();
		faces = 12;
	}

	public List<Symbol> roll() {
	
	int roll = this.rollNumeric();
	
	switch (roll) {
	case 1: return Arrays.asList(Symbol.FORCE_DARK);
	case 2: return Arrays.asList(Symbol.FORCE_DARK);
	case 3: return Arrays.asList(Symbol.FORCE_DARK);
	case 4: return Arrays.asList(Symbol.FORCE_DARK);
	case 5: return Arrays.asList(Symbol.FORCE_DARK);
	case 6: return Arrays.asList(Symbol.FORCE_DARK);
	case 7: return Arrays.asList(Symbol.FORCE_DARK, Symbol.FORCE_DARK);
	case 8: return Arrays.asList(Symbol.FORCE_LIGHT);
	case 9: return Arrays.asList(Symbol.FORCE_LIGHT);
	case 10: return Arrays.asList(Symbol.FORCE_LIGHT, Symbol.FORCE_LIGHT);
	case 11: return Arrays.asList(Symbol.FORCE_LIGHT, Symbol.FORCE_LIGHT);
	case 12: return Arrays.asList(Symbol.FORCE_LIGHT, Symbol.FORCE_LIGHT);
	
	}
	assert(true == false);	
	return Arrays.asList();
	}
	

}
