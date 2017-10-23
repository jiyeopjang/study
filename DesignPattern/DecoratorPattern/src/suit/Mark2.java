package suit;

public abstract class Mark2 {
	protected String name = "Mark2";
	protected String weapons = "RepulsorBeam";
	protected int attackPoint = 10;
	
	public String getName(){
		return this.name;
	}
	
	public String getWeapons(){
		return this.weapons;
	}
	
	public void printStat(){
		System.out.println("수트명 : " + this.getName());
		System.out.println("무기리스트 : " + this.getWeapons());
		System.out.println("공격력 : " + this.getAttackPoint());
	}
	
	public abstract int getAttackPoint();

}
