package sec06.exam01;

public class Car7Example {
	public static void main(String[] args) {
		Car7 myCar = new Car7("포르쉐");
		Car7 yourCar = new Car7("벤츠");
		// myCar 와 yourCar는 다른 객체를 공유한다.
		
		myCar.run();
		yourCar.run();
	}
}
