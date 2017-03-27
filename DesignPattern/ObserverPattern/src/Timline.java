import observer.impl.Avengers;
import observer.impl.CaptainAmerica;
import observer.impl.Hulk;
import observer.impl.Ironman;
import observer.impl.Vision;
import observer.values.EnemyStatus;

public class Timline {
	static public void main(String[] args){
		//������ü ����
		Avengers avengers = new Avengers();
		
		//��������ü ���� �� �߰�
		CaptainAmerica captainAmerica = new CaptainAmerica(avengers);
		Ironman ironman = new Ironman(avengers);
		Hulk hulk = new Hulk(avengers);
		
		//�������� �ƴ� ��ü ����
		Vision vision = new Vision();
		
		//0. ������
		System.out.println("======= ������ ========");
		avengers.setStat(EnemyStatus.NONE);
		
		//1. ���� ����
		System.out.println("======= ���� ���� ========");
		avengers.setStat(EnemyStatus.APPEAR);
		
		//2. ���� ����
		System.out.println("======= ���� ���� ========");
		avengers.setStat(EnemyStatus.ATTACK);
		// - ������ ���� �� �߰�
		avengers.remove(ironman);
		avengers.add(vision);
		
		//3. ���� ����
		System.out.println("======= ���� ���� ========");
		avengers.setStat(EnemyStatus.DISAPPEAR);
	} 
}
