package sec06.exam01;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator(); // 위의 라이브러리용 코드인 Calculator 클래스를 사용하기 위한 코드
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10; // 매개값이 int 이기 때문에 컴파일에러 발생하지 않음
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
	}
}
