package suit.factory;

import suit.CombatSuit;
import suit.HydroSuit;
import suit.SpaceSuit;
import suit.StealthSuit;
import suit.Suit;

public class TypeSuitFactory extends SuitFactory{

	@Override
	public Suit createSuit(String type) {
		Suit suit = null;
		
		switch(type){
			case("space"): 
				suit = new SpaceSuit();
			break;
			case("hydro"):
				suit = new HydroSuit();
			break;
			case("stealth"):
				suit = new StealthSuit();
			break;
			default:
				suit = new CombatSuit();
		}
		
		return suit;
	}
}
