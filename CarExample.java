package sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); // 객체 생성
		
		// 필드값 읽기
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 60; // 변수 사용하는 방법처럼 값을 변경해줌
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}
