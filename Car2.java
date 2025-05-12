package sec06.exam05;

public class Car2 {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car2 myCar = new Car2(); // static으로 객체 생성 후 사용
		myCar.speed = 60;
		myCar.run();
	}
}
