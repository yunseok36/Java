package sec07.exam01;

public class SupersonicAirplane extends Airplane{ // 클래스 Airplane 을 상속받은 SupersonicAirplane 클래스 선언
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly(); // Airplane 객체의 fly() 메소드 호출
		}
	}
}
