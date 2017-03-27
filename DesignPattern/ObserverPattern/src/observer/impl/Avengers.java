package observer.impl;

import java.util.LinkedList;
import java.util.List;

import observer.inter.Observer;
import observer.inter.Subject;
import observer.values.EnemyStatus;

public class Avengers implements Subject {
	private List<Observer> heros;
	private EnemyStatus stat;
	
	public Avengers(){
		System.out.println("어벤져스 창설");
		heros = new LinkedList<Observer>();
	}
	
	@Override
	public void add(Observer observer) {
		heros.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		if(heros.contains(observer)){
			heros.remove(observer);
		} 

	}

	@Override
	public void notifyObservers() {
		for(Observer hero : heros){
			hero.update(stat);
		}
	}
	
	@Override
	public void notifyObserver(Observer observer){
		observer.update(stat);
	}

	//상태 변경이 있을 때 옵저버 들에게 알림
	public void setStat(EnemyStatus stat) {
		this.stat = stat;
		notifyObservers();
	}
	
	public List<Observer> getMembers(){
		return this.heros;
	}
	
	

}
