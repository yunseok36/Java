package sec02.exam01;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2); // JDK6.0 특징, 문자열 연결연산자가 먼저 실행되기 때문에 모두 문자열로 바뀌어서 연산 결과 출력 됌
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3); // JDK33.0, 문자열 연결연산자가 먼저 실행되기 때문에 모두 문자열로 바뀌어서 연산 결과 출력 됌
		System.out.println(str4); // 6.0JDK, 산술 연산이 먼저 실행되고 문자열 연결
	}
}
