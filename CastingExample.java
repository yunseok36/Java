package sec01.exam03;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; // 강제타입변환
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
