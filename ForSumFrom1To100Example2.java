package sec04.exam01;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		int sum = 0; // 전역변수
		
		int i = 0; // 전역변수
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
