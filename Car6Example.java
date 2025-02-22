package sec06.exam01;

public class Car6Example {
	public static void main(String[] args) {
		Car6 myCar = new Car6(); // 클래스 Car6를 참조하기 위한 코드
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
	}
}
