package driver;

import java.util.ArrayList;
import java.util.List;

import dice.AbilityDie;
import dice.BoostDie;
import dice.Die;
import dice.DifficultyDie;
import dice.ProficiencyDie;
import dice.Symbol;

public class RunSimulation {
	
	public static void main(String[] args) {		
		
//		PercentileDie p = new PercentileDie();
		List<Die> dieList = new ArrayList<Die>();
		addProfDice(dieList, 1);
//		addAbilDice(dieList, 1);		
		addDiffDice(dieList, 3);	
		dieList.add(new BoostDie());
//		dieList.add(new BoostDie());
		
		
		int trials = 100000;
		List<Outcome> oList = new ArrayList<Outcome>();
		for (int i = 0; i < trials; i++) {			
			oList.add(getOutcome(dieList));
		}		
		
		int tSuccessCount = 0;
		int tSuccessMargin = 0;
		int tAdvThrMargin = 0;
		int tTriCount = 0;
		int tDespCount = 0;
		int twfSuccessCount = 0;
		for (Outcome outcome : oList) {
			if (outcome.successMargin > 0)  {
				tSuccessCount++;
				if (outcome.advOrThreatMargin >= 2) {
					twfSuccessCount++;
				}
			}
			tSuccessMargin += outcome.successMargin;
			tAdvThrMargin += outcome.advOrThreatMargin;
			tTriCount += outcome.triCount;
			tDespCount += outcome.despCount;
			
			
		}
		System.out.println("Success %: " + Double.valueOf(tSuccessCount) / Double.valueOf(trials) );
		System.out.println("Coulda been TWF %: " + Double.valueOf(twfSuccessCount) / Double.valueOf(trials) );
		
		System.out.println("Success Margin: " + Double.valueOf(tSuccessMargin) / Double.valueOf(trials) );
		System.out.println("Adv or Threat Margin: " + Double.valueOf(tAdvThrMargin) / Double.valueOf(trials) );
		System.out.println("Triumph: " + Double.valueOf(tTriCount) / Double.valueOf(trials) );
		System.out.println("Despair: " + Double.valueOf(tDespCount) / Double.valueOf(trials) );
		System.out.println();
	}
	
	private static void addDiffDice(List<Die> dieList, int dice) {
		for (int i = 0; i < dice; i++) {
			dieList.add(new DifficultyDie());
		}
	}
	
	private static void addAbilDice(List<Die> dieList, int dice) {
		for (int i = 0; i < dice; i++) {
			dieList.add(new AbilityDie());
		}
	}

	private static void addProfDice(List<Die> dieList, int dice) {
		for (int i = 0; i < dice; i++) {
			dieList.add(new ProficiencyDie());
		}
		
	}

	public static Outcome getOutcome(List<Die> dList) {
		int suc = 0;
		int fail = 0;
		int adv = 0;
		int thrt = 0;
		int trmph = 0;
		int desp = 0;
		
		for (Die die : dList) {
			List<Symbol> s = die.roll();
			
			for (Symbol symbol : s) {
				if (symbol == Symbol.SUCCESS) {
					suc++;
				} else if (symbol == Symbol.FAILURE) {
					fail++;
				} else if (symbol == Symbol.ADVANTAGE) {
					adv++;
				} else if (symbol == Symbol.THREAT) {
					thrt++;
				} else if (symbol == Symbol.TRIUMPH) {
					trmph++;
				} else if (symbol == Symbol.DESPAIR) {
					desp++;
				}
			}
		}
		
		int successMargin = suc + trmph - fail - desp;
		int advCount = adv - thrt;
		

		return new Outcome(successMargin, advCount, trmph, desp);
	}
	
}
