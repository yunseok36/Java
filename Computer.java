package sec07.exam01;

public class Computer extends Calculator {
	@Override // 주석이라서 생략 가능함
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행"); // 재정의
		return Math.PI * r * r;
	} // 자바 라이브러리에 있는 Math 에서 제공하는 PI 값을 사용함
}
