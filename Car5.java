package sec06.exam01;

public class Car5 {

	// 핃드 생성
	int gas; // 필드에 gas 값이 지정되어 있지 않기 때문에 초기값 0으로 할당(저장)된다.
	
	// 생성자
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas; // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드값을 변경
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true; // true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas잔량 : " + gas + ")");
				return; // 메소드 실행종료
			}
		}
	}
}
