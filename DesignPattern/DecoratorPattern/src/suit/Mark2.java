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
		System.out.println("��Ʈ�� : " + this.getName());
		System.out.println("���⸮��Ʈ : " + this.getWeapons());
		System.out.println("���ݷ� : " + this.getAttackPoint());
	}
	
	public abstract int getAttackPoint();

}
