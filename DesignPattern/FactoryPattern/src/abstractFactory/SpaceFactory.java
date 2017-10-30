package abstractFactory;

import suit.SpaceSuit;
import suit.Suit;

public class SpaceFactory implements SuitAbstractFactory {

	@Override
	public Suit createSuit() {
		return new SpaceSuit();
	}

}
