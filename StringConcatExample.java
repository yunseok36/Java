package sec01.exam03;

public class StringConcatExample {
	public static void main(String[] args) {
		// 숫자 연산
		int value = 10 + 2+ 8;
		System.out.println("value : " + value); // 20
		
		// 문자열 변환
		String str1 = 10 + 2 + "8";
		System.out.println("str1 : " + str1); // 숫자 X, 128
		
		String str2 = 10 + "2" + 8;
		System.out.println("str2 : " + str2); // 숫자 X, 1028
		
		String str3 = "10" + 2 + 8;
		System.out.println("str3 : " + str3); // 숫자 X, 1028
		
		String str4 = "10" + (2 + 8);
		System.out.println("str4 : " + str4); // 숫자 X, 1010
	}
}
