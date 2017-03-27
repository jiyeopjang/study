package observer.impl;

import observer.inter.Heros;
import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class CaptainAmerica implements Observer,Heros {
	
	public CaptainAmerica(){};
	public CaptainAmerica(Subject team){
		System.out.println("캡틴아메리카 합류");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {	
		this.behavior(stat);		
	}
	
	@Override
	public void behavior(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("캡틴아메리카 : 대기중"); break;
			case APPEAR: System.out.println("캡틴아메리카 : 유니폼 및 방패 착용"); break;
			case ATTACK: System.out.println("캡틴아메리카 : 효과없음"); break;
			case DISAPPEAR: System.out.println("캡틴아메리카 : 유니폼 및 방패 해제"); break;
		}
	}
}
