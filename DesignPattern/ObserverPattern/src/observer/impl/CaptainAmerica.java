package observer.impl;

import observer.inter.Heros;
import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class CaptainAmerica implements Observer,Heros {
	
	public CaptainAmerica(){};
	public CaptainAmerica(Subject team){
		System.out.println("ĸƾ�Ƹ޸�ī �շ�");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {	
		this.behavior(stat);		
	}
	
	@Override
	public void behavior(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("ĸƾ�Ƹ޸�ī : �����"); break;
			case APPEAR: System.out.println("ĸƾ�Ƹ޸�ī : ������ �� ���� ����"); break;
			case ATTACK: System.out.println("ĸƾ�Ƹ޸�ī : ȿ������"); break;
			case DISAPPEAR: System.out.println("ĸƾ�Ƹ޸�ī : ������ �� ���� ����"); break;
		}
	}
}
