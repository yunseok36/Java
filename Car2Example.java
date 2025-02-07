package sec03.exam02;

public class Car2Example {
	public static void main(String[] args) {
		Car2 myCar = new Car2();
		// 객체 Car 를 사용하기 위해서 객체 Car 의 메모리 주소값을 myCar 에 저장(할당)한다.
		// 객체 생성
		
		// 필드값 선언
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 필드값 선언
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}
