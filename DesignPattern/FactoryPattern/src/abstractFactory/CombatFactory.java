package abstractFactory;

import suit.CombatSuit;
import suit.Suit;

public class CombatFactory implements SuitAbstractFactory {

	@Override
	public Suit createSuit() {
		return new CombatSuit();
	}

}
