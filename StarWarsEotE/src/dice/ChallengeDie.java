package dice;

import java.util.Arrays;
import java.util.List;

public class ChallengeDie extends Die {
	
	public ChallengeDie() {
		super();
		faces = 12;
	}

	public List<Symbol> roll() {
	
	int roll = this.rollNumeric();
	
	switch (roll) {
	case 1: return Arrays.asList();
	case 2: return Arrays.asList(Symbol.FAILURE);
	case 3: return Arrays.asList(Symbol.FAILURE);
	case 4: return Arrays.asList(Symbol.FAILURE, Symbol.FAILURE);
	case 5: return Arrays.asList(Symbol.FAILURE, Symbol.FAILURE);
	case 6: return Arrays.asList(Symbol.THREAT);
	case 7: return Arrays.asList(Symbol.THREAT);
	case 8: return Arrays.asList(Symbol.THREAT, Symbol.FAILURE);
	case 9: return Arrays.asList(Symbol.THREAT, Symbol.FAILURE);
	case 10: return Arrays.asList(Symbol.THREAT, Symbol.THREAT);
	case 11: return Arrays.asList(Symbol.THREAT, Symbol.THREAT);
	case 12: return Arrays.asList(Symbol.DESPAIR);
	
	}
	assert(true == false);	
	return Arrays.asList();
	}

}
