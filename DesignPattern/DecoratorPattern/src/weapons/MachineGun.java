package weapons;

import suit.Mark2;

public class MachineGun extends WeaponsDecorator {	
	public MachineGun(Mark2 suit){
		this.suit = suit;
	}
	
	@Override
	public String getName(){
		return suit.getName();
	}
	
	@Override
	public String getWeapons() {		
		return suit.getWeapons() + " MachineGun";
	}

	@Override
	public int getAttackPoint() {
		return suit.getAttackPoint() + 10;
	}

}
