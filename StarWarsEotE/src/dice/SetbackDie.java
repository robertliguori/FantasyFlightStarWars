package dice;

import java.util.Arrays;
import java.util.List;

public class SetbackDie extends Die {
	public SetbackDie() {
		super();
		faces = 6;
	}

	public List<Symbol> roll() {
	
	int roll = this.rollNumeric();
	
	switch (roll) {
	case 1: return Arrays.asList();
	case 2: return Arrays.asList();
	case 3: return Arrays.asList(Symbol.FAILURE);
	case 4: return Arrays.asList(Symbol.FAILURE);
	case 5: return Arrays.asList(Symbol.THREAT);
	case 6: return Arrays.asList(Symbol.THREAT);
	}
	assert(true == false);	
	return Arrays.asList();
	}

}
