package sec02.exam01;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // true, 1.0으로 변환
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // false
		System.out.println((float)v4 == v5); // true, v4를 강제 float 으로 변환
	}
}
