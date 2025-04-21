package sec08.exam02;

public class Vehicle2Example {
	public static void main(String[] args) {
		Vehicle2 vehicle = new Bus2();
		
		vehicle.run(); // vehicle.checkFare(); , vehicle 인터페이스에는 checkFare() 가 없음
		
		Bus2 bus = (Bus2) vehicle; // 강제타입변환
		
		bus.run();
		bus.checkFare(); // Bus2 클래스에는 checkFare() 가 있음
	}
}
