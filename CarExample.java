package sec06.exam04;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // Car의 setGas() 메소드를 호출
		
		boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}
}
