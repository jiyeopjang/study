package observer.impl;

import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class Watcher implements Observer {
	Subject subject; 
	
	public Watcher(Subject subject){
		this.subject = subject;
		this.subject.add(this);
	}
	
	public void checkStat(){
		System.out.println("======= 상태체크 ========");
		subject.notifyObserver(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("(와처 : 대기)"); break;
			case APPEAR: System.out.println("(와처 : 빌런등장 기록)"); break;
			case ATTACK: System.out.println("(와처 : 빌런공격 기록)"); break;
			case DISAPPEAR: System.out.println("(와처 : 빌런제거 기록)"); break;
		}

	}

}
