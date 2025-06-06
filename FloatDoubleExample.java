package sec01.exam02;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		// float var1 = 3.14; -> 컴파일 에러 발생
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789f; // float 은 7자리까지만 허용
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		System.out.println("var5 : " + var5);
		
		// e 사용하기 (expernential)
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		System.out.println("var6 : " + var6);
		System.out.println("var7 : " + var7);
		System.out.println("var8 : " + var8);
	}
}
