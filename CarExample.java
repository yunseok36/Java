package sec06.exam05;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		// myCar와 yourCar는 다른 객체를 공유함
		
		myCar.run();
		yourCar.run();
	}
}
