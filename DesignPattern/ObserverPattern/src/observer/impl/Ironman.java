package observer.impl;

import observer.inter.Heros;
import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class Ironman implements Observer,Heros {
	
	public Ironman(){};
	public Ironman(Subject team){
		System.out.println("���̾�� �շ�");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {	
		this.behavior(stat);		
	}
	
	//
	@Override
	public void behavior(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("���̾�� : �����"); break;
			case APPEAR: System.out.println("���̾�� : ��Ʈ ����"); break;
			case ATTACK: System.out.println("���̾�� : ��ŷ����. �����Ұ��� "); break;
			case DISAPPEAR: System.out.println("���̾�� : ��Ʈ ����"); break;
		}
	}
	

}
