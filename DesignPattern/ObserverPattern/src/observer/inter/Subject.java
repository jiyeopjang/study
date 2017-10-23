package observer.inter;

public interface Subject {
	public void add(Observer observer); //������ ��ü �߰�
	public void remove(Observer observer); //������ ��ü ����
	public void notifyObservers(); //������ ��ü�鿡�� ���� Ǫ��
	public void notifyObserver(Observer observer); //Ư����ü���� ���� Ǫ��
}
