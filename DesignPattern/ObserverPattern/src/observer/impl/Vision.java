package observer.impl;

import observer.inter.Heros;
import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class Vision implements Observer,Heros {
	
	public Vision(){};
	public Vision(Subject team){
		System.out.println("���� �շ�");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {	
		this.behavior(stat);		
	}
	
	@Override
	public void behavior(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("���� : �����"); break;
			case APPEAR: System.out.println("���� : �����غ�"); break;
			case ATTACK: System.out.println("���� : ȿ������"); break;
			case DISAPPEAR: System.out.println("���� : �������� ����"); break;
		}
	}
}
