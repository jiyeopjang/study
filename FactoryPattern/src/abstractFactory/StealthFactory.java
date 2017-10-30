package abstractFactory;

import suit.StealthSuit;
import suit.Suit;

public class StealthFactory implements SuitAbstractFactory {

	@Override
	public Suit createSuit() {
		return new StealthSuit();
	}

}
