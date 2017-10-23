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
		System.out.println("======= ����üũ ========");
		subject.notifyObserver(this);
	}
	
	@Override
	public void update(EnemyStatus stat) {
		switch(stat){
			case NONE: System.out.println("(��ó : ���)"); break;
			case APPEAR: System.out.println("(��ó : �������� ���)"); break;
			case ATTACK: System.out.println("(��ó : �������� ���)"); break;
			case DISAPPEAR: System.out.println("(��ó : �������� ���)"); break;
		}

	}

}
