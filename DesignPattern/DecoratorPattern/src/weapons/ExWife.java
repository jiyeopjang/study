package weapons;

import suit.Mark2;

public class ExWife extends WeaponsDecorator {
	public ExWife(Mark2 suit){
		this.suit = suit;
	}
	
	@Override
	public String getName(){
		return suit.getName();
	}

	@Override
	public String getWeapons() {		
		return suit.getWeapons() + " ExWife";
	}

	@Override
	public int getAttackPoint() {
		return suit.getAttackPoint() + 1;
	}

}
