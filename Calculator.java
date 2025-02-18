package sec06.exam01;

public class Calculator { // 클래스, 메소드 선언

	// 메소드
	void powerOn() { // 리턴 값이 없기 때문에 매개값 필요없음
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
