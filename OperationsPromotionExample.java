package sec01.exam03;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; -> 컴파일 에러 발생
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1; // 문자로 출력된다.
		// char charValue3 = charValue1 + charValue2; -> 컴파일 에러 발생
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2); // 65에 1을 더해 66인 유니코드 대문자 B 로 출력된다.
		
		int intValue3 = 10;
		int intValue4 = intValue3/4; // 결과는 2.5인데 정수형의 변수에 저장되야 하기 때문에 intValue4 에는 2가 저장된다.
		System.out.println(intValue4);
		
		int intValue5 = 10;
		// int intValue6 = 10 / 4.0; -> 컴파일 에러 발생
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}
}
