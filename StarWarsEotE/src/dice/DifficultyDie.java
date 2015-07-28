package dice;

import java.util.Arrays;
import java.util.List;

public class DifficultyDie extends Die {
	public DifficultyDie() {
		super();
		faces = 8;
	}

	public List<Symbol> roll() {
	
	int roll = this.rollNumeric();
	
	switch (roll) {
	case 1: return Arrays.asList();
	case 2: return Arrays.asList(Symbol.FAILURE);
	case 3: return Arrays.asList(Symbol.FAILURE, Symbol.FAILURE);
	case 4: return Arrays.asList(Symbol.THREAT);
	case 5: return Arrays.asList(Symbol.THREAT);
	case 6: return Arrays.asList(Symbol.THREAT);
	case 7: return Arrays.asList(Symbol.THREAT, Symbol.THREAT);
	case 8: return Arrays.asList(Symbol.FAILURE, Symbol.THREAT);
	}
	assert(true == false);	
	return Arrays.asList();
	}

}
