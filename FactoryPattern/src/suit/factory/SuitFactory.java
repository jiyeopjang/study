package suit.factory;

import suit.Suit;

public abstract class SuitFactory {
	public abstract Suit createSuit(String type);
}
