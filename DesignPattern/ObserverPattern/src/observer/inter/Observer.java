package observer.inter;

import observer.values.EnemyStatus;

public interface Observer {
	public void update(EnemyStatus stat); // 옵저버들의 상태 업데이트
}
