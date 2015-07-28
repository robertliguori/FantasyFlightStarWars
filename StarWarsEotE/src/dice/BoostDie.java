package dice;

import java.util.Arrays;
import java.util.List;

public class BoostDie extends Die{
	
	public BoostDie() {
		super();
		faces = 6;
	}

	public List<Symbol> roll() {
	
	int roll = this.rollNumeric();
	
	switch (roll) {
	case 1: return Arrays.asList();
	case 2: return Arrays.asList();
	case 3: return Arrays.asList(Symbol.ADVANTAGE, Symbol.ADVANTAGE);
	case 4: return Arrays.asList(Symbol.ADVANTAGE);
	case 5: return Arrays.asList(Symbol.SUCCESS, Symbol.ADVANTAGE);
	case 6: return Arrays.asList(Symbol.SUCCESS);
	}
	assert(true == false);	
	return Arrays.asList();
	}


}
