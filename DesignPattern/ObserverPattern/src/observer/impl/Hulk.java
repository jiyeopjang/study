package observer.impl;

import observer.inter.Heros;
import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class Hulk implements Observer,Heros {
	
	public Hulk(){};
	public Hulk(Subject team){
		System.out.println("��ũ �շ�");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {	
		this.behavior(stat);		
	}
	
	@Override
	public void behavior(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("��ũ : ��罺 ��� ����"); break;
			case APPEAR: System.out.println("��ũ : ��ũ�� ����"); break;
			case ATTACK: System.out.println("��ũ : ������"); break;
			case DISAPPEAR: System.out.println("��ũ : ���� ����"); break;
		}
	}
}
