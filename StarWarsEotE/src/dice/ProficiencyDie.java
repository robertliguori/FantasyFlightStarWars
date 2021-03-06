package dice;

import java.util.Arrays;
import java.util.List;

public class ProficiencyDie extends Die {
	
	
	public ProficiencyDie() {
		super();
		faces = 12;
	}

	public List<Symbol> roll() {
	
	int roll = this.rollNumeric();
	
	switch (roll) {
	case 1: return Arrays.asList();
	case 2: return Arrays.asList(Symbol.SUCCESS);
	case 3: return Arrays.asList(Symbol.SUCCESS);
	case 4: return Arrays.asList(Symbol.SUCCESS, Symbol.SUCCESS);
	case 5: return Arrays.asList(Symbol.SUCCESS, Symbol.SUCCESS);
	case 6: return Arrays.asList(Symbol.ADVANTAGE);
	case 7: return Arrays.asList(Symbol.ADVANTAGE, Symbol.SUCCESS);
	case 8: return Arrays.asList(Symbol.ADVANTAGE, Symbol.SUCCESS);
	case 9: return Arrays.asList(Symbol.ADVANTAGE, Symbol.SUCCESS);
	case 10: return Arrays.asList(Symbol.ADVANTAGE, Symbol.ADVANTAGE);
	case 11: return Arrays.asList(Symbol.ADVANTAGE, Symbol.ADVANTAGE);
	case 12: return Arrays.asList(Symbol.TRIUMPH);
	
	}
	assert(true == false);	
	return Arrays.asList();
	}
	

}
