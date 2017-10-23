package weapons;

import suit.Mark2;

public class GatlingGun extends WeaponsDecorator {	
	public GatlingGun(Mark2 suit){
		this.suit = suit;
	}
	
	@Override
	public String getName(){
		return suit.getName();
	}

	@Override
	public String getWeapons() {		
		return suit.getWeapons() + " GatlingGun";
	}

	@Override
	public int getAttackPoint() {
		return suit.getAttackPoint() + 15;
	}

}
